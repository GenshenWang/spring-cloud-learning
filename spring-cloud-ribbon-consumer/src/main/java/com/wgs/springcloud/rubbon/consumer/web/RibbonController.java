package com.wgs.springcloud.rubbon.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wanggenshen
 * @date: 2020/7/9 14:23.
 * @description: 测试Ribbon负载均衡
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon/call")
    public String call() {

        return restTemplate.getForEntity("http://eureka-client-provider/hello", String.class).getBody();
    }

    @GetMapping("/ribbon/retry")
    public String retry() {

        return restTemplate.getForEntity("http://eureka-client-provider/retry", String.class).getBody();
    }
}
