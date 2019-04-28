package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String OPENID = "1212121";
    private final String Order_id = "1556439569610148999";


    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("dad");
        orderDTO.setBuyerAddress("dadadada");
        orderDTO.setBuyerPhone("12312321321");
        orderDTO.setBuyerOpenid(OPENID);

        List<OrderDetail> orderDetailList = new ArrayList<>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("123");
        orderDetail.setProductQuantity(1);
        orderDetailList.add(orderDetail);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
    }

    @Test
    public void findOne() {
        OrderDTO result = orderService.findOne(Order_id);
        System.out.println(result.toString());
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancle() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}