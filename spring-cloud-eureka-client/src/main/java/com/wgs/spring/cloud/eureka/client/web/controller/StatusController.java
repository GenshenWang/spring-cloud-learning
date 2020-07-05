package com.wgs.spring.cloud.eureka.client.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wanggenshen
 * @date: 2020/7/2 23:44.
 * @description: XXX
 */
@RestController
public class StatusController {

    @GetMapping("/status")
    public String status() {
        return "Eureka client run ok";
    }
}
