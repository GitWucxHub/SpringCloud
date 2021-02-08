package com.alphago.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerconsulOrder8082Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerconsulOrder8082Application.class, args);
    }

}
