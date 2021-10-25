package com.example.multimodulesexample.apia;

import com.example.multimodulesexample.apia.dummy.service.DummyService;
import com.example.multimodulesexample.domain.ModuleDomainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@SpringBootApplication(scanBasePackages = {
//        "com.example.multimodulesexample.domain",   // domain 패키지
//        "com.example.multimodulesexample.common",    // common 패키지
//        "com.example.multimodulesexample.apia"
//         com.example.multimodulesexample.apia
//        "com.example.multimodulesexample.gateway",    // gateway 패키지
//        "com.example.multimodulesexample"
//})

//@EnableConfigurationProperties
//@ConfigurationPropertiesScan(basePackages = "com.example.multimodulesexample")
@EnableJpaRepositories(basePackageClasses = ModuleApiAApplication.class)
@EntityScan(basePackageClasses = ModuleApiAApplication.class)
@SpringBootApplication(scanBasePackages = "com.example.multimodulesexample")
public class ModuleApiAApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(ModuleApiAApplication.class, args);
        System.out.println(run.getBean(DummyService.class));
    }
}
