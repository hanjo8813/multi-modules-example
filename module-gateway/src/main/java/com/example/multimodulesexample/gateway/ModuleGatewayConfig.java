package com.example.multimodulesexample.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.example.multimodulesexample.gateway")
@Configuration
public class ModuleGatewayConfig {
}
