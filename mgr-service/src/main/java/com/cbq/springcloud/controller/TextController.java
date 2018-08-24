package com.cbq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TextController {

    @Value("${server.port}")
    String port;

    @Value("${cbq}")
    String cbq;

    @GetMapping("")
    public String getMsg(@RequestParam String msg) {
        return "hi " + msg + ",port:" + port + ",cbq:" + cbq;
    }
}
