package com.example.Springassignment2.task3_4_5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.Springassignment2.task3_4_5")
@PropertySource("classpath:application.properties")
public class StudentConfig { }
