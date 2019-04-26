package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /**
     * 订单
     */
    @Id
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
    private Integer orderStatus = 0;

    /** 默认为0 未支付*/
    private Integer payStatus = 0;

    /**
     * 创建时间
     */
    private Date createTime;

    private Date updateTime;

}
