package com.example.multimodulesexample.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String renderIndexPage() {
        return "index";
    }
}
