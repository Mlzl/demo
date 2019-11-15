package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = {"diy_name.properties", "diy_name2.properties"})

public class ConfigController {

    @Value("${config.test}")
    private String value;


    @Value("${config.test2}")
    private String value2;

    @RequestMapping(value = "/config/test")
    public String testConfig(){
        return value + value2;
    }
}
