package com.alphago.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerzookeeperOrder8081Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerzookeeperOrder8081Application.class, args);
    }

}
