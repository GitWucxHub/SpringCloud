package com.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaConsumerNacosOrder8083Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerNacosOrder8083Application.class, args);
    }

}
