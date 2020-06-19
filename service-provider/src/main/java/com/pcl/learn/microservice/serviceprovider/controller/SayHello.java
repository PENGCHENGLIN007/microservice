package com.pcl.learn.microservice.serviceprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pengchenglin
 * @create 2020-06-19 11:30
 */
@Controller
public class SayHello {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
