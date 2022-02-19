package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/calculate")
    public String getCalculate(@RequestParam Integer integer1, @RequestParam Integer integer2){
        integer1 = integer1 + integer2;
        return "calculate";
    }
}
