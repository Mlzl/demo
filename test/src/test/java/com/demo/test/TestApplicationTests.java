package com.demo.test;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@BenchmarkMode(Mode.AverageTime)
public class TestApplicationTests {

    @Benchmark
    public void test() {
        System.out.println("");
    }

}
