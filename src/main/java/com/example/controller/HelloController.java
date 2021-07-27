package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("added!");

        System.out.println("some new");

        return "Heiio, anotoher-World!";
    }
}
