package com.pcl.learn.microservice.service1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pengchenglin
 * @create 2020-06-19 15:52
 */
@Controller
public class ClientController {
    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello(){
        return "I'm from client server point,hello!";
    }
}
