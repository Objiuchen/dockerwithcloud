package com.jiuchen.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient("service-a")
@RestController
public interface ServiceFeign {
    // 调用远程服务(与service模块的controller URL对应)
    @GetMapping("/service/sayHello")
    String sayHello();
}
