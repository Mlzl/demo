package com.example.demo.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Bootstrap extends WebMvcConfigurerAdapter {

    @Bean
    public RestTemplate getRestTemplate() {
        Logger logger = LoggerFactory.getLogger(this.getClass().getName());
        logger.warn("get me !!!!!!!!!!!!!!!!!");
        return new RestTemplate();
    }
}
