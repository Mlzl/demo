package com.example.aspect;

import lombok.AllArgsConstructor;

/**
 * @author ambi
 * @data 2021/7/1 20:39
 */
@AllArgsConstructor
public enum ReturnDataType {
    byte_type("可以指定返回byte或者Byte类型的值"),
    short_type("可以指定返回short或者Short类型的值"),
    int_type("可以指定返回int或者Integer类型的值"),
    long_type("可以指定返回long或者Long类型的值"),
    float_type("可以指定返回float或者Float类型的值"),
    double_type("可以指定返回double或者Double类型的值"),
    boolean_type("可以指定返回boolean或者Boolean类型的值"),
    char_type("可以指定返回char或者Char类型的值"),
    null_type("返回null"),
    object_type("返回objectClass指定的类，该类必须包含无参构造参数，否则会抛异常"),
    ;
    String desc;
}
