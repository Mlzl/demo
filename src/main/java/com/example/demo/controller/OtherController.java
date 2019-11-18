package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/other")
public class OtherController {
    @Autowired
    UserService userService;

    @GetMapping("/async_test")
    public void asyncTest() throws InterruptedException{
        log.info("async task start");
        userService.async();
        log.info("async task end");
    }
}
