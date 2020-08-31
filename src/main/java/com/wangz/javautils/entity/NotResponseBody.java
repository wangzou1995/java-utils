package com.wangz.javautils.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package com.wangzou.oauthservice.controller
 * @Description: 不添加到响应体中
 * @date 2020/7/16/ 10:39 上午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NotResponseBody {
}
