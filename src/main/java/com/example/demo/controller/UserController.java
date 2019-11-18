package com.example.demo.controller;

import com.example.demo.entity.UserDO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add_json")
    public String add(@RequestBody UserDO userDO) {
        try {
            if (userDO.getCreate_at() == null) {
                return "create_at not null";
            }
            userService.addUser(userDO);
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping(value = "/add")
    public String add(@RequestParam("name") String username,
                      @RequestParam("id") long id
    ) {
        UserDO userDO = new UserDO();
        userDO.setUsername(username);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        userDO.setCreate_at(sdf.format(new Date()));
        userDO.setId(id);
        userService.addUser(userDO);
        return "success";
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable("id") long id) {
        return userService.getNameById(id);
    }

    @GetMapping(value = "/list")
    public List<UserDO> getAll(){
        return userService.getAll();
    }
}
