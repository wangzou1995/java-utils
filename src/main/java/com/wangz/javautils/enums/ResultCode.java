package com.wangz.javautils.enums;

import lombok.Getter;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package com.wangz.javautils.enums
 * @Description: 统一结果代码枚举类
 * @date 2020/8/17/ 3:11 下午
 */
@Getter
public enum ResultCode {

    SUCCESS(1000, "操作成功"),
    FAILED(1001, "响应失败"),
    VALIDATE_FAILED(1002, "参数校验失败"),
    ERROR(5000, "未知错误");
    private final int code;
    private final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
