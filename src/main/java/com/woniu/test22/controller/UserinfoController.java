package com.woniu.test22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserinfoController {
    @GetMapping("/say")
    public String say(){
        System.out.println("hello");
        return "hello";
    }

}
