package com.wgs.spring.cloud.feign.web;

import com.wgs.spring.cloud.feign.domain.OrderInfo;
import com.wgs.spring.cloud.feign.service.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wanggenshen
 * @date: 2020/7/11 13:48.
 * @description: XXX
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignOrderController {

    @Autowired
    private FeignOrderService feignOrderService;

    @GetMapping(value = "getUnpayOrders")
    public String getUnpayOrders() {
        return feignOrderService.getUnpayOrders();
    }

    @GetMapping(value = "getOrderInfoByOrderNo")
    public String getOrderInfoByOrderNo() {
        return feignOrderService.getOrderInfoByOrderNo("1231231aaa");
    }

    @GetMapping(value = "getOrderDetailByOrderNo")
    public String getOrderDetailByOrderNo() {
        return feignOrderService.getOrderDetailByOrderNo("232343fff");
    }
}
