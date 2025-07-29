package com.mytests.spring.springtestcontextdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class BeansConfig {
    @Bean
    SomeBean someBeanFromSrc() {
        return new SomeBean("bean from src");
    }
}
