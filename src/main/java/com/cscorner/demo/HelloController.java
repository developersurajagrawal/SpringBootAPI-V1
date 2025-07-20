package com.cscorner.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/Hello")
    public String getMethodName() {
        return "Hello Suraj";
    }
    
}
