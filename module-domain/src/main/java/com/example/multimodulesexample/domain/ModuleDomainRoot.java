package com.example.multimodulesexample.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 현재 클래스의 패키지 하위 컴포넌트를 Bean으로 스캔
@ComponentScan(basePackageClasses = { ModuleDomainRoot.class })
@Configuration
public class ModuleDomainRoot {
    // yaml의 datasource가 bean으로 등록되도록 아무거나 띄워줘야함
}
