package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
