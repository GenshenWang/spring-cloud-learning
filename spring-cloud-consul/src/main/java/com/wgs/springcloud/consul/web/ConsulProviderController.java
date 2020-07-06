package com.wgs.springcloud.consul.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wanggenshen
 * @date: 2020/7/6 16:03.
 * @description: Consul服务提供者
 */
@RestController
public class ConsulProviderController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hello")
    public String hello() {
        return "hello, this is from consul provider , port=" + port;
    }
}
