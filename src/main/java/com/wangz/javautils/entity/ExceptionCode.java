package com.wangz.javautils.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package com.wangz.javautils.entity
 * @Description: 异常编码注解
 * @date 2020/8/17/ 3:13 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExceptionCode {
    int value() default 1000;

    String message() default "参数校验错误";
}
