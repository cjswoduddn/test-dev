package com.example.testenv.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Optional;
import java.util.stream.Stream;

@RequestMapping
@RestController
@Slf4j
public class HelloController {


    @GetMapping("/hello")
    public String hello() throws Exception{
        Thread.sleep(15000);
        log.info("success");
        Optional.of("string").ifPresent(a->{
            try{
                te();
            }catch (Exception e){}
        });
        return "hello";
    }

    public void te() throws SQLException{
        throw new SQLException();
    }
}
