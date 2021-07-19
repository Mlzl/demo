package com.bigo.demo.zookeeper.zookeeper.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * @author ambi
 * @data 2021/6/11 16:35
 */
@Slf4j
public class WatcherApi implements Watcher {

    @Override
    public void process(WatchedEvent watchedEvent) {
        log.info("【Watcher监听事件】={}", watchedEvent);
    }
}
