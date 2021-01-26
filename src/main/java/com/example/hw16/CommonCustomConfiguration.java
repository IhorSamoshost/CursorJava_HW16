package com.example.hw16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonCustomConfiguration {
    public CommonCustomConfiguration() {
        System.out.println("CommonCustomConfiguration is enabled");
    }

    @Bean
    public String testBean() {
        System.out.println("Test bean from CommonCustomConfiguration is created");
        return "test";
    }
}
