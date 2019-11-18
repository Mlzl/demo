package com.example.demo.service;

import ch.qos.logback.classic.Logger;
import com.example.demo.dao.UserRepository;
import com.example.demo.entity.UserDO;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDO addUser(UserDO user){
        return userRepository.save(user);
    }

    public String getNameById(long id){
        return userRepository.getNameById(id);
    }

    public List<UserDO> getAll(){
        return userRepository.findAll();
    }

    @Async("monitorExecutor")
    public void async(){
        log.info("async task start");
        System.out.println("");
        log.info("async task end");
    }
}
