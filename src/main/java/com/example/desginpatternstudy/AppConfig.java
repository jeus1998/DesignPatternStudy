package com.example.desginpatternstudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String hello(){
        return "hello";
    }
}
