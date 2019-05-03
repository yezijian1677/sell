package com.imooc.sell.service;

import com.imooc.sell.dataobject.Seller;

public interface SellerService {

    Seller findSellerInfoByOpenid(String openid);
}
