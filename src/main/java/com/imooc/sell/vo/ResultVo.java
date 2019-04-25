package com.imooc.sell.vo;

import lombok.Data;

@Data
public class ResultVo<T> {

    /** 错误码*/
    private Integer code;
    /** 信息提示*/
    private String msg;

    /** 具体数据*/
    private T data;
}
