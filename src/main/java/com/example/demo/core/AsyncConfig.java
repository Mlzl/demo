package com.example.demo.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;
@Configuration
@Slf4j
public class AsyncConfig {

    @Bean(name="monitorExecutor")
    public ThreadPoolTaskExecutor monitorExecutor(){
        ThreadPoolTaskExecutor te = new ThreadPoolTaskExecutor();
        te.setCorePoolSize(1);
        te.setMaxPoolSize(1);
        te.setQueueCapacity(100);
        te.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        log.info("monitorExecutor start");

        return te;
    }
}
