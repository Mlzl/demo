package com.bigo.demo.zookeeper.zookeeper.controller;

import com.bigo.demo.zookeeper.zookeeper.service.WatcherApi;
import com.bigo.demo.zookeeper.zookeeper.service.ZookeeperApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.KeeperException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ambi
 * @data 2021/6/11 16:36
 */
@Slf4j
@RestController
public class ZookeeperController {
    @Autowired
    private ZookeeperApi zkApi;

    @Autowired
    private ObjectMapper objectMapper;

    WatcherApi watcherApi = new WatcherApi();

    @GetMapping("/createNode")
    public boolean createNode(@RequestParam String path, @RequestParam String data) {
        log.debug("ZookeeperController create node {},{}", path, data);
        return zkApi.createNode(path, data);
    }

    @GetMapping("/createNode1")
    public boolean createNode1(@RequestParam String path, @RequestParam String data) {
        log.debug("ZookeeperController create node {},{}", path, data);
        return zkApi.createNode1(path, data);
    }

    @GetMapping("/createNode2")
    public boolean createNode2(@RequestParam String path, @RequestParam String data) {
        log.debug("ZookeeperController create node {},{}", path, data);
        return zkApi.createNode2(path, data);
    }

    @GetMapping("/createNode3")
    public boolean createNode3(@RequestParam String path, @RequestParam String data) {
        log.debug("ZookeeperController create node {},{}", path, data);
        return zkApi.createNode3(path, data);
    }

    @GetMapping("/updateNode")
    public boolean updateNode(@RequestParam String path, @RequestParam String data) {
        log.debug("ZookeeperController create node {},{}", path, data);
        return zkApi.updateNode(path, data);
    }

    @GetMapping("/getNode")
    public Object createNode(@RequestParam String path) throws JsonProcessingException {
        log.debug("ZookeeperController create node {}", path);
        return objectMapper.writeValueAsString(zkApi.exists(path, watcherApi));
    }

    @GetMapping("/getData")
    public Object getData(@RequestParam String path) throws KeeperException, InterruptedException, JsonProcessingException {
        log.debug("ZookeeperController create node {}", path);
        return objectMapper.writeValueAsString(zkApi.getChildren(path));
    }

    @GetMapping("/deleteNode")
    public boolean deleteNode(@RequestParam String path) {
        log.debug("ZookeeperController create node {}", path);
        return zkApi.deleteNode(path);
    }
}
