package com.example.demo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Bootstrap extends WebMvcConfigurerAdapter {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate(getClientHttpRequestFactory());
    }

    private ClientHttpRequestFactory getClientHttpRequestFactory(){
        HttpComponentsClientHttpRequestFactory crf = new HttpComponentsClientHttpRequestFactory();
        crf.setReadTimeout(2000);
        crf.setConnectTimeout(2000);
        return crf;
    }
}
