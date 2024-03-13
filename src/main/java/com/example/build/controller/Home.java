package com.example.build.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Home {
    @GetMapping
    public String home(){
        return "hello abdellah";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello erray";
    }
    @GetMapping("/hello2")
    public String hello2(){
        return "hello2 erray";
    }
    @GetMapping("/hello3")
    public String hello3(){
        return "hello3 erray";
    }

}
