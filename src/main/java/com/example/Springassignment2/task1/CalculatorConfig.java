package com.example.Springassignment2.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

}
