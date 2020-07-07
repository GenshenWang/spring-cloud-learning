package com.wgs.springcloud.consul.config.web;

import com.wgs.springcloud.consul.config.config.ConsulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wanggenshen
 * @date: 2020/7/6 22:41.
 * @description: XXX
 */
@RestController
@RefreshScope
public class ConsulConfigController {

    @Value("${PAY_SUCCESS_MSG}")
    private String paySuccessMsg;

    @Autowired
    private ConsulConfig consulConfig;

    @GetMapping(value = "/paySuccessMsg")
    public String getValue() {
        System.out.println("paySuccessMsg:" + paySuccessMsg);
        return paySuccessMsg;
    }


    @GetMapping(value = "/config")
    public String getPaySuccessMsg() {
        System.out.println("config:" + consulConfig.getPaySuccessMsg());
        return consulConfig.getPaySuccessMsg();
    }

}
