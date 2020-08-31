package com.wangz.javautils.vo;

import com.wangz.javautils.entity.ExceptionCode;
import com.wangz.javautils.enums.ResultCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package com.wangz.javautils.vo
 * @Description: 响应结果VO实体类
 * @date 2020/8/17/ 3:08 下午
 */
@Getter
@ToString
public class ResultVO<T> {
    private final int code;
    private final String msg;
    private final boolean result;
    private final T data;

    public ResultVO(T data, boolean result) {
        this(ResultCode.SUCCESS, data, result);
    }

    public ResultVO(ResultCode resultCode, T data, boolean result) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
        this.result = result;
    }

    public ResultVO(ExceptionCode annotation, T data) {
        this.code = annotation.value();
        this.msg = annotation.message();
        this.data = data;
        this.result = false;
    }

    public ResultVO(int code, String msg, T data, boolean result) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.result = result;
    }

}
