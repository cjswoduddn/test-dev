package com.example.testenv.second;

import com.example.testenv.first.FirstController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("second")
@RestController
@RequiredArgsConstructor
public class SecondController {

    private final FirstController firstController;

    @GetMapping
    public String second(){
        log.info("hello, second");
        return "Hello, Second!";
    }
}
