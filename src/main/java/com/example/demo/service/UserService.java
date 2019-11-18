package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Async
    public void async() throws InterruptedException{
        System.out.println("async task start");
        Thread.sleep(3000);
        System.out.println("async task end");
    }
}
