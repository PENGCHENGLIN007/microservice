package com.pcl.learn.microservice.servicecaller.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pengchenglin
 * @create 2020-06-19 11:33
 */
@FeignClient(value = "service-provider")
public interface SayHelloCaller {

    @RequestMapping("/hello")
    String sayHello();
}
