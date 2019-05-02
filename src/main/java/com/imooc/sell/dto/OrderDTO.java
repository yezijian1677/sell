package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.util.serializer.Data2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址*/
    private String buyerAddress;

    /** 买家微信id*/
    private String buyerOpenid;

    /** 订单价格*/
    private BigDecimal orderAmount;

    /** 订单状态， 默认为新下单*/
    private Integer orderStatus;

    /** 默认为0 未支付*/
    private Integer payStatus;

    /**
     * 创建时间
     */
    @JsonSerialize(using = Data2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using = Data2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
