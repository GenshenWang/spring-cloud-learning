package com.wgs.springcloud.consul.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: wanggenshen
 * @date: 2020/7/6 16:28.
 * @description: 调用服务
 */
@RestController
public class InvokeController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consul/services")
    public List<String> services() {
        return discoveryClient.getServices();
    }

    @GetMapping("consul/invoke")
    public String invoke() {
        // 调用spring-cloud-consul-service提供的 "/hello" 方法
        return restTemplate.getForEntity("http://spring-cloud-consul-service/hello", String.class)
                .getBody();
    }

}
