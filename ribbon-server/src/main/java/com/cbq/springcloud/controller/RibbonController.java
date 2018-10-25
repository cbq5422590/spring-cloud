package com.cbq.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("")
    @HystrixCommand(fallbackMethod = "getMsgError")
    public String getMsg(@RequestParam String msg) {
        return restTemplate.getForObject("http://mgr-service/test?msg=" + msg, String.class);
    }

    public String getMsgError(String msg) {
        System.out.println("error....");
        return null;
    }
}