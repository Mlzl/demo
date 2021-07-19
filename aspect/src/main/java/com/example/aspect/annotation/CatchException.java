package com.example.aspect.annotation;

import com.example.aspect.ReturnDataType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ambi
 * @data 2021/7/1 19:57
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CatchException {
    /**
     * 返回的数据类型 默认返回空指针；
     * 1、目前支持8中基本数据类型指定默认值；
     * 2、其他对象只能返回由无参构造函数构造的实例，所以objectClass参数对应的类必须包含无参构造函数
     */
    ReturnDataType returnDataType() default ReturnDataType.null_type;

    /**
     * 告警接口，如果不设置或者给null，则不告警
     */
    String alarmInterface() default "";

    /**
     * 当发生异常时，是否捕获
     */
    boolean isCatch() default true;


    /**
     * 相应类型为byte基本类型的默认值
     */
    int byteValue() default 0;

    /**
     * 相应类型为short基本类型的默认值
     */
    short shortValue() default 0;

    /**
     * 相应类型为int基本类型的默认值
     */
    int intValue() default 0;

    /**
     * 相应类型为long基本类型的默认值
     */
    long longValue() default 0L;

    /**
     * 相应类型为int基本类型的默认值
     */
    float floatValue() default 0.0F;

    /**
     * 相应类型为double基本类型的默认值
     */
    double doubleValue() default 0.0d;

    /**
     * 相应类型为boolean基本类型的默认值
     */
    boolean boolValue() default false;

    /**
     * 相应类型为char基本类型的默认值
     */
    char charValue() default 0;

    /**
     * 传入的类必须包含无参构造方法
     */
    Class objectClass() default Object.class;
}
