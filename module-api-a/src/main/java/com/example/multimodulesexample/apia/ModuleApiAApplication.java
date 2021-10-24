package com.example.multimodulesexample.apia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


//@SpringBootApplication(scanBasePackages = {
//        "com.example.multimodulesexample.domain",   // domain 패키지
//        "com.example.multimodulesexample.common",    // common 패키지
//        "com.example.multimodulesexample.apia"
//         com.example.multimodulesexample.apia
//        "com.example.multimodulesexample.gateway",    // gateway 패키지
//        "com.example.multimodulesexample"
//})

@ConfigurationPropertiesScan(basePackages = "com.example.multimodulesexample")
@SpringBootApplication(scanBasePackages = "com.example.multimodulesexample")
public class ModuleApiAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleApiAApplication.class, args);
    }
}
