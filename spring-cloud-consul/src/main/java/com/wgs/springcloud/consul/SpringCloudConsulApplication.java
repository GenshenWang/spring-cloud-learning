package com.wgs.springcloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @EnableDiscoveryClient 开启服务发现能力
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulApplication.class, args);
	}

}
