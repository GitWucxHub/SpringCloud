package com.alphago.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderHystrixPayment8007Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixPayment8007Application.class, args);
    }

}
