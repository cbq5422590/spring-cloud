package com.cbq.springcloud.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class TestApiError implements TestApi {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "msg") String msg) {
        System.out.println("error....");
        return null;
    }
}