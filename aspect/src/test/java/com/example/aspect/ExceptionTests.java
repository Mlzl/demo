package com.example.aspect;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ExceptionTests {


    @Autowired
    TestService testService;

    @Test
    public void testVoid() throws Exception {
        log.info("before testVoid");
        testService.testVoid();
        log.info("after testVoid");
    }

    @Test
    public void testReturnByte() throws Exception {
        log.info("before testReturnByte");
        log.info("after testReturnByte, return:{}", testService.testReturnByte());
    }

    @Test
    public void testReturnInt() throws Exception {
        log.info("before testReturnInt");
        log.info("after testReturnInt, return:{}", testService.testReturnInt());
    }

    @Test
    public void testReturnNull() throws Exception {
        log.info("before testReturnNull");
        log.info("after testReturnNull, return:{}", testService.testReturnNull());
    }

    @Test
    public void testReturnObject() throws Exception {
        log.info("before testReturnNull");
        log.info("after testReturnNull, return:{}", testService.testReturnObject());
    }

    @Test
    public void testReturnShort() throws Exception {
        log.info("before testReturnShort");
        log.info("after testReturnShort, return:{}", testService.testReturnShort());
    }
}
