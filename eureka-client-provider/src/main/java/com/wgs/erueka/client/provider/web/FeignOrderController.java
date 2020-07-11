package com.wgs.erueka.client.provider.web;

import com.wgs.erueka.client.provider.domain.OrderInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: wanggenshen
 * @date: 2020/7/11 13:17.
 * @description: XXX
 */
@RestController
public class FeignOrderController {

    @GetMapping(value = "getUnpayOrders")
    public String getUnpayOrders() {
        return "获取待支付订单列表: 12334534, 3434545, 657676756";
    }

    @GetMapping(value = "getOrderInfoByOrderNo")
    public String getOrderInfoByOrderNo(@RequestParam("orderNo") String orderNo) {
        return "获取订单信息 " + orderNo;
    }

    @GetMapping(value = "getOrderDetailByOrderNo")
    public OrderInfo getOrderDetailByOrderNo(@RequestParam("orderNo") String orderNo) {
        BigDecimal money = BigDecimal.valueOf(199);
        String userName = "Tom";
        OrderInfo orderInfo = new OrderInfo(orderNo, money, userName, new Date());
        return orderInfo;
    }

}
