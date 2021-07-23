package com.demo.test.benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

/**
 * @author ambi
 * @data 2021/7/23 16:59
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Fork(value = 2)
public class Target {

    @Benchmark
    public void hashMap() {
        HashMap hm = new HashMap<>();
        hm.put("1", "1");
    }

    @Benchmark
    public void hashTable() {
        Hashtable hm = new Hashtable<>();
        hm.put("1", "1");
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(Target.class.getSimpleName())
                .forks(1).build();
        new Runner(opt).run();
    }
}
