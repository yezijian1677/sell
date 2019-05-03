package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.Seller;
import com.imooc.sell.repository.SellerInfoRepository;
import com.imooc.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;

public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public Seller findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}