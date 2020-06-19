package com.pcl.learn.microservice.servicecaller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pengchenglin
 * @create 2020-06-19 15:55
 */
@Controller
public class CallerServer {
    @RequestMapping("/sayhello")
    @ResponseBody
    public String sayHello(){
        return "I'm from caller server point,hello!";
    }
}
