package com.jiuchen.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/service")
@RestController
public class DataController {
    // 写一个方法 注册到eureka
    @GetMapping("/sayHello")
    public String sayHello(){
        return "<h1>Hello SpringCloud With Docker!</h1>";
    }
}
