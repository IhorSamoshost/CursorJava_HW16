package com.example.hw16;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "com.example.hw16.ConfigurationEnabler")
public class CustomAutoconfiguration {
    public CustomAutoconfiguration() {
        System.out.println("CustomAutoconfiguration with condition on existence class ConfigurationEnabler is enabled");
    }

    @Bean
    @ConditionalOnProperty(name = "custom.configuration", havingValue = "true")
    public void testPropertyCustomConfigurationEnabled() {
        System.out.println("Test bean from CustomAutoconfiguration with condition on value of property is created");
    }
}
