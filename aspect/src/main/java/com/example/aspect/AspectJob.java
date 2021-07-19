package com.example.aspect;

import com.example.aspect.annotation.AroundAspect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ambi
 * @data 2021/7/1 14:29
 */
@Slf4j
@Service
public class AspectJob {

    public void statisticMethod() {
        log.info("AspectJob:statistic-method");
    }

    public void beforeAspect() {
        log.info("exec beforeAspect method");
    }

    public String afterAspect() {
        log.info("exec afterAspect method");
        return "after";
    }

    public void afterRunningAspect() {
        log.info("exec afterRunningAspect method");
    }

    public void afterThrowingAspect() {
        log.info("exec afterThrowingAspect method");
    }

    @AroundAspect
    public void aroundAspect(String res) throws Exception {
        log.info("AspectJob:exec aroundAspect method:{}", res);
        throw new Exception("exception");
    }
}
