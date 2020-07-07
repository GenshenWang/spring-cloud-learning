package com.wgs.springcloud.consul.config.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: wanggenshen
 * @date: 2020/7/6 22:37.
 * @description: 对应Consul配置
 */
// @RefreshScope注解: 仅做标识,当监听到Consul有配置变更, 会刷新当前类ConsulConfig中属性值
@Component
@ConfigurationProperties
public class ConsulConfig {

    private String paySuccessMsg;

    public String getPaySuccessMsg() {
        return paySuccessMsg;
    }

    public void setPaySuccessMsg(String paySuccessMsg) {
        this.paySuccessMsg = paySuccessMsg;
    }

    public ConsulConfig(String paySuccessMsg) {
        this.paySuccessMsg = paySuccessMsg;
    }

    public ConsulConfig() {
    }

    @Override
    public String toString() {
        return "ConsulConfig{" +
                "paySuccessMsg='" + paySuccessMsg + '\'' +
                '}';
    }
}
