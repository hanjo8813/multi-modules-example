package com.example.multimodulesexample.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

// 부모 프로젝트들에 포함된 컴포넌트를 스캔해줘야 함.
@SpringBootApplication(scanBasePackages = {
        "com.example.multimodulesexample.domain",   // domain 패키지
        "com.example.multimodulesexample.common"    // common 패키지
})
public class ModuleAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleAdminApplication.class, args);
    }
}
