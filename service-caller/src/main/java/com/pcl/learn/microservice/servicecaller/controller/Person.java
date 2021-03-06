package com.pcl.learn.microservice.servicecaller.controller;

import com.pcl.learn.microservice.servicecaller.feignclient.SayHelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pengchenglin
 * @create 2020-06-19 11:37
 */
@Controller
public class Person {

    @Autowired
    private SayHelloCaller caller;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return caller.sayHello();
    }
}
