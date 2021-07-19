package com.bigo.demo.zookeeper.zookeeper.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ambi
 * @data 2021/6/11 16:27
 */
@Service
@Slf4j
public class ZookeeperApi {

    @Autowired
    private ZooKeeper zkClient;

    public boolean exists(String nodeName, boolean needWatch) {
        try {
            return zkClient.exists(nodeName, needWatch) == null;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return false;
    }

    /**
     * 检测结点是否存在 并设置监听事件
     * 三种监听类型： 创建，删除，更新
     *
     * @param path
     * @param watcher 传入指定的监听类
     * @return
     */
    public Stat exists(String path, Watcher watcher) {
        try {
            return zkClient.exists(path, watcher);
        } catch (Exception e) {
            log.error("【断指定节点是否存在异常】{},{}", path, e);
            return null;
        }
    }

    /**
     * 创建持久化节点
     *
     * @param path
     * @param data
     */
    public boolean createNode(String path, String data) {
        try {
            log.info("createNode: {}:{}", path, zkClient.create(path, data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT));
            return true;
        } catch (Exception e) {
            log.error("【创建持久化节点异常】{},{},{}", path, data, e);
            return false;
        }
    }

    /**
     * 持久节点顺序节点
     *
     * @param path
     * @param data
     */
    public boolean createNode1(String path, String data) {
        try {
            log.info("createNode1: {}:{}", path, zkClient.create(path, data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL));
            return true;
        } catch (Exception e) {
            log.error("【创建持久化节点异常】{},{},{}", path, data, e);
            return false;
        }
    }

    /**
     * 持久节点顺序节点
     *
     * @param path
     * @param data
     */
    public boolean createNode2(String path, String data) {
        try {
            log.info("createNode2: {}:{}", path, zkClient.create(path, data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL));
            return true;
        } catch (Exception e) {
            log.error("【创建持久化节点异常】{},{},{}", path, data, e);
            return false;
        }
    }

    /**
     * 持久节点顺序节点
     *
     * @param path
     * @param data
     */
    public boolean createNode3(String path, String data) {
        try {
            log.info("createNode3: {}:{}", path, zkClient.create(path, data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL));
            return true;
        } catch (Exception e) {
            log.error("【创建持久化节点异常】{},{},{}", path, data, e);
            return false;
        }
    }

    /**
     * 修改持久化节点
     *
     * @param path
     * @param data
     */
    public boolean updateNode(String path, String data) {
        try {
            //zk的数据版本是从0开始计数的。如果客户端传入的是-1，则表示zk服务器需要基于最新的数据进行更新。如果对zk的数据节点的更新操作没有原子性要求则可以使用-1.
            //version参数指定要更新的数据的版本, 如果version和真实的版本不同, 更新操作将失败. 指定version为-1则忽略版本检查
            zkClient.setData(path, data.getBytes(), -1);
            return true;
        } catch (Exception e) {
            log.error("【修改持久化节点异常】{},{},{}", path, data, e);
            return false;
        }
    }

    /**
     * 删除持久化节点
     *
     * @param path
     */
    public boolean deleteNode(String path) {
        try {
            //version参数指定要更新的数据的版本, 如果version和真实的版本不同, 更新操作将失败. 指定version为-1则忽略版本检查
            zkClient.delete(path, -1);
            return true;
        } catch (Exception e) {
            log.error("【删除持久化节点异常】{},{}", path, e);
            return false;
        }
    }

    /**
     * 获取当前节点的子节点(不包含孙子节点)
     *
     * @param path 父节点path
     */
    public List<String> getChildren(String path) throws KeeperException, InterruptedException {
        return zkClient.getChildren(path, false);
    }

    /**
     * 获取指定节点的值
     *
     * @param path
     * @return
     */
    public String getData(String path, Watcher watcher) {
        try {
            Stat stat = new Stat();
            byte[] bytes = zkClient.getData(path, watcher, stat);
            return new String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
