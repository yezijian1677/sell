package com.imooc.sell.enums;

import com.imooc.sell.util.EnumUtil;

public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCLE(2, "已取消"),
    ;

    private Integer Code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        Code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
