package com.example.SpringProjectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(){
        return "Hello World!";
    }


    @GetMapping(value = "/indexHome")
    public String getIndex(){
        return "/indexHome";
    }
}


