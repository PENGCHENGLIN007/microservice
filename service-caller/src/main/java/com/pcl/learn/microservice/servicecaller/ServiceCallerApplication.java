package com.pcl.learn.microservice.servicecaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServiceCallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCallerApplication.class, args);
    }

}
