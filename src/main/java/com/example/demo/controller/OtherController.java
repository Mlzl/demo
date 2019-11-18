package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/other")
@EnableAsync


public class OtherController {
    @Autowired
    UserService userService;

    @GetMapping("/async_test")
    public void asyncTest() throws InterruptedException{
        userService.async();
    }
}
