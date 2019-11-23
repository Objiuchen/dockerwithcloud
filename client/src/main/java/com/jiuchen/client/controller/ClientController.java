package com.jiuchen.client.controller;

import com.jiuchen.client.feign.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ServiceFeign serviceFeign;

    // 利用feign调用远程服务
    @GetMapping("/sayHello")
    public String sayHello(){
        return serviceFeign.sayHello();
    }
}
