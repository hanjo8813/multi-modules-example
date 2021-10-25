package com.example.multimodulesexample.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// 현재 클래스가 포함된 패키지의 하위 컴포넌트를 Bean으로 스캔
@EntityScan(basePackageClasses = ModuleDomainConfig.class)
@EnableJpaRepositories(basePackageClasses = ModuleDomainConfig.class)
@ComponentScan(basePackageClasses = ModuleDomainConfig.class)
@Configuration
public class ModuleDomainConfig {
    // + yaml의 datasource가 bean으로 등록되도록 @Configuration 설정
}
