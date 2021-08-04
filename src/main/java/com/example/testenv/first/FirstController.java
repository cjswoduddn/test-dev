package com.example.testenv.first;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("first")
public class FirstController {

    @GetMapping
    public String first(){
        log.info("hello, first!");
        return "Hello, First!";
    }
}
