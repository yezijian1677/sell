package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123123");
        orderDetail.setOrderId("111");
        orderDetail.setProductName("dada");
        orderDetail.setProductIcon("dadad");
        orderDetail.setProductId("2323");
        orderDetail.setProductPrice(new BigDecimal(2.3));
        orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }
}