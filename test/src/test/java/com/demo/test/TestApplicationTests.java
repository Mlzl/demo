package com.demo.test;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@BenchmarkMode(Mode.AverageTime)
public class TestApplicationTests {

    @Test
    public void test() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(3, TimeUnit.SECONDS);
        builder.addInterceptor(new OkHttpClientRequestInterceptor());


        OkHttp3ClientHttpRequestFactory httpRequestFactory = new OkHttp3ClientHttpRequestFactory(builder.build());
        httpRequestFactory.setReadTimeout(2000);
        httpRequestFactory.setConnectTimeout(5000);


        RestTemplate restTemplate = new RestTemplate(httpRequestFactory);

        List<HttpMessageConverter<?>> httpMessageConverters = restTemplate.getMessageConverters();
        httpMessageConverters.stream().forEach(httpMessageConverter -> {
            if (httpMessageConverter instanceof StringHttpMessageConverter) {
                StringHttpMessageConverter messageConverter = (StringHttpMessageConverter) httpMessageConverter;
                messageConverter.setDefaultCharset(Charset.forName("UTF-8"));
            }
        });

        restTemplate.getForObject("http://127.0.0.1:8000/get_test?sleep=2500", String.class);
    }


}
