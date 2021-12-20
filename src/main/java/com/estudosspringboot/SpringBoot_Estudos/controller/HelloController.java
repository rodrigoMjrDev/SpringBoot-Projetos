package com.estudosspringboot.SpringBoot_Estudos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage() {
        return "Hello, this is my first project!!!";
    }

}
