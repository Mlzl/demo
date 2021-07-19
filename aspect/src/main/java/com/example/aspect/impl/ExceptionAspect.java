package com.example.aspect.impl;

import com.example.aspect.annotation.CatchException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ambi
 * @data 2021/7/1 20:03
 */
@Aspect
@Component
@Slf4j
public class ExceptionAspect {

    @Around(value = "@annotation(catchException)", argNames = "joinPoint,catchException")
    public Object aroundAspect(ProceedingJoinPoint joinPoint, CatchException catchException) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (Exception e) {
            log.error("Exception method:{}", joinPoint.getSignature().toLongString(), e);
            //告警
            if (!"".equals(catchException.alarmInterface())) {
                catchException.alarmInterface();
//                DefaultMetric.alarm("Exception method:" + joinPoint.getSignature().getName() + ", msg:" + e.getMessage(), catchException.alarmInterface());
            }
            //如果设置抛出异常，则直接抛出，此切面相当于记录日志
            if (!catchException.isCatch()) {
                throw e;
            }

            //是否是8种基础类型，装箱类型也可以使用
            switch (catchException.returnDataType()) {
                case byte_type:
                    return catchException.byteValue();
                case short_type:
                    return catchException.shortValue();
                case int_type:
                    return catchException.intValue();
                case long_type:
                    return catchException.longValue();
                case float_type:
                    return catchException.floatValue();
                case double_type:
                    return catchException.doubleValue();
                case char_type:
                    return catchException.charValue();
                case object_type:
                    return catchException.objectClass().newInstance();
                default:
                    return null;
            }

        }
    }
}
