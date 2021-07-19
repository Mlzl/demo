package com.example.aspect.impl;

import com.example.aspect.AspectJob;
import com.example.aspect.annotation.AroundAspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author ambi
 * @data 2021/7/1 14:32
 */
@Aspect
@Service
@Slf4j
public class AspectAspect {

    @Pointcut(value = "@annotation(aroundAspect)")
    private void aroundPointCut(AroundAspect aroundAspect) {
    }

    @Around(value = "aroundPointCut(aroundAspect)", argNames = "point,aroundAspect")
    public Object aroundAspect(ProceedingJoinPoint point, AroundAspect aroundAspect) throws Throwable {
        try {
            String methodName = point.getSignature().getName();

            log.info("AspectService:aroundAspect start {}", aroundAspect);

            log.info("AspectService:aroundAspect start {},{},sign:{}", point.getSignature().toShortString(), point.getSignature().toLongString(), point.getSignature().getDeclaringTypeName());
            ((AspectJob) point.getThis()).statisticMethod();

            Object result = point.proceed(point.getArgs());
            log.info("AspectService:aroundAspect end {}", methodName);
            return result;
        } catch (Exception e) {
            log.info("exception {}", e.getMessage());
            return null;
        }
    }


    @Pointcut(value = "execution(* com.example.aspect.AspectJob.beforeAspect(..))")
    private void beforePointCut() {

    }

    @Before("beforePointCut()")
    public void beforeAspect(JoinPoint joinPoint) {
        log.info("before exec method:{}", joinPoint.getSignature().getName());
    }


    @Pointcut(value = "execution(* com.example.aspect.AspectJob.afterAspect(..))")
    private void afterPointCut() {

    }

    @After("afterPointCut()")
    public void afterAspect(JoinPoint joinPoint) {
        log.info("after exec method:{},joint:{}", joinPoint.getSignature().getName(), joinPoint.getKind());
    }


    @Pointcut(value = "execution(* com.example.aspect.AspectJob.afterThrowingAspect(..))")
    private void afterThrowingPointCut() {

    }

    @AfterThrowing("afterThrowingPointCut()")
    public void afterThrowingAspect(JoinPoint joinPoint) {
        log.info("after exec method:{}", joinPoint.getSignature().getName());
    }
}
