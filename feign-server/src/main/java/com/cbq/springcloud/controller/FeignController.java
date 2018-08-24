package com.cbq.springcloud.controller;

import com.cbq.springcloud.feign.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    TestApi api;

    @RequestMapping(value = "/feign",method = RequestMethod.GET)
    public String feign(@RequestParam String msg){
        return api.sayHiFromClientOne(msg);
    }
}
