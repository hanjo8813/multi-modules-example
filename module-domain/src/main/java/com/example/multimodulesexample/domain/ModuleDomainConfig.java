package com.example.multimodulesexample.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// 현재 클래스가 포함된 패키지의 하위 컴포넌트를 Bean으로 스캔
@EntityScan(basePackageClasses = {ModuleDomainConfig.class})
@EnableJpaRepositories(basePackageClasses = ModuleDomainConfig.class)
@ComponentScan(basePackageClasses = ModuleDomainConfig.class)
// 패키지를 지정, 패키지 하위의 컴포넌트 싹 스캔
//@EntityScan(basePackages = "com.example.multimodulesexample.domain")    // @Entity 컴포넌트 스캔 (ComponentScan과 별개임)
//@EnableJpaRepositories(basePackages = "com.example.multimodulesexample.domain")     // 자식 프로젝트가 해당 JpaRepository를 사용할 수 있도록 함
//@ComponentScan(basePackages = "com.example.multimodulesexample.domain")
@Configuration
public class ModuleDomainConfig {
    // + yaml의 datasource가 bean으로 등록되도록 @Configuration 설정
}
