package com.wgs.spring.cloud.feign.service;

import com.wgs.spring.cloud.feign.domain.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: wanggenshen
 * @date: 2020/7/11 13:30.
 * @description: 想调用服务eureka-client-provider中类FeignOrderController提供的服务,
 *                 需要先在自己的服务中声明一个接口,接口中方法需要与FeignOrderController一样
 */
@FeignClient(name = "${feign.order.service.name}")
public interface FeignOrderService {

    @GetMapping(value = "getUnpayOrders")
    String getUnpayOrders();

    @GetMapping(value = "getOrderInfoByOrderNo")
    String getOrderInfoByOrderNo(@RequestParam("orderNo") String orderNo);

    @GetMapping(value = "getOrderDetailByOrderNo")
    String getOrderDetailByOrderNo(@RequestParam("orderNo") String orderNo);
}
