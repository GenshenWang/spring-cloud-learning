package com.wgs.eureka.client.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wanggenshen
 * @date: 2020/7/5 12:16.
 * @description: Eureka Client Consumer + 负载均衡 示例
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        String result = restTemplate.getForEntity("http://eureka-client-provider/hello", String.class).getBody();
        return "来自Eureka-client的调用结果:" + result;
    }
}
