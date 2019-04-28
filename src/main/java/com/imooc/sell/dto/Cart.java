package com.imooc.sell.dto;

import lombok.Data;

@Data
public class Cart {

    public Cart(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    private String productId;

    private Integer productQuantity;
}
