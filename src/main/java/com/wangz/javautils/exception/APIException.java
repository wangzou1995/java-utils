package com.wangz.javautils.exception;

import lombok.Getter;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package com.wangzou.oauthservice.exception
 * @Description: Api异常类
 * @date 2020/7/16/ 10:27 上午
 */
@Getter
public class APIException extends RuntimeException {
    private final int code;
    private final String msg;

    public APIException() {
        this(1001, "接口错误");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
