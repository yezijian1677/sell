package com.imooc.sell.repository;

import com.imooc.sell.dataobject.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInfoRepository extends JpaRepository<Seller, String> {
    Seller findByOpenid(String openid);
}
