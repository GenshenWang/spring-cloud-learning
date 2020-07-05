package com.wgs.erueka.client.provider.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author: wanggenshen
 * @date: 2020/7/4 23:20.
 * @description: Eureka服务提供者, 会注册到注册中心
 */
@RestController
public class EurekaClientHelloController {

    private final Logger logger = Logger.getLogger("EurekaClientHelloController");

    /**
     * 服务发现客户端
     * DiscoveryClient负责与EurekaServer 注册、续约、下线
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Registration registration;

    @GetMapping(value = "/hello")
    public String index() {

        // 根据当前实例注册的id获取所有实例
        // registration.getServiceId(): 配置的spring.application.name 的值
        List<ServiceInstance>  instanceInfos = discoveryClient.getInstances(registration.getServiceId());

        logger.info("获取服务实例:" + instanceInfos);

        return "Hello Eureka Client";
    }

}
