package com.alphago.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudConsumerFeignHystrixOrder8085Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder8085Application.class, args);
    }

}
