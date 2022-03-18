package com.example.SpringProjectdemo.controller;

import com.example.SpringProjectdemo.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


