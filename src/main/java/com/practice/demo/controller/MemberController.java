package com.practice.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}