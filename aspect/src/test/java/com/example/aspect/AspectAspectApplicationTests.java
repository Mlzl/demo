package com.example.aspect;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class AspectAspectApplicationTests {


    @Autowired
    AspectJob aspectJob;

    @Test
    public void test() throws Exception {
        aspectJob.aroundAspect("around");
        log.info("AspectServiceApplicationTests:result");
    }

    @Test
    public void test2(){
        System.out.println(int.class == Integer.class);
        System.out.println(Integer.class == Integer.class);
    }
}
