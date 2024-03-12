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
}
