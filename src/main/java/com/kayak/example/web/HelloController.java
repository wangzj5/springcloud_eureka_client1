package com.kayak.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("你好！我的端口号："+port);
        return "你好！我的端口号："+port;
    }
}
