package com.demo.test.benchmark;

import com.demo.test.OkHttpClientRequestInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ambi
 * @data 2021/7/23 16:59
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Measurement(iterations = 5, time = 5)
@State(Scope.Benchmark)
@Fork(value = 2)
public class Target {

    @Benchmark
    public void reflect() {
//        try {
//            RealInterceptorChain chain = new RealInterceptorChain(null, null, null, null, 0, null);
//            Field field = chain.getClass().getDeclaredField("interceptors");
//            field.setAccessible(true);
//            List<Interceptor> interceptors = (List<Interceptor>) field.get(chain);
//            for (Interceptor interceptor : interceptors) {
//                if (interceptor instanceof RetryAndFollowUpInterceptor) {
//                }
//            }
//        } catch (Exception e) {
//
//        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(Target.class.getSimpleName())
                .forks(1).build();
        new Runner(opt).run();
    }
}
