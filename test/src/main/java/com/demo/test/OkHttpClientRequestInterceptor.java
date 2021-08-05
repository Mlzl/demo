package com.demo.test;

import ch.qos.logback.classic.gaffer.PropertyUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;

import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * RestTemplate拦截器，记录请求情况
 *
 * @author zhangjialian
 * @date 2020-06-22 20:02
 */
@Slf4j
public class OkHttpClientRequestInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Response response;

        // 记录请求前的时间
        try {
            response = chain.proceed(request);


            log.info("response:{}", getRemoteAddr(chain));

        } catch (Exception var16) {

            throw var16;
        }

        return response;
    }

    public String getRemoteAddr(Chain chain) {
        try {
            return ((RealInterceptorChain) chain).transmitter().connection.route().socketAddress().getAddress().getHostAddress();
        } catch (Exception ignored) {
        }
        // for (Interceptor interceptor :chain.)
        return "";
    }
}
