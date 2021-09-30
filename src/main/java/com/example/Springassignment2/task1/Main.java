package com.example.Springassignment2.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);

        Calculator calculator = context.getBean(Calculator.class);

        System.out.println("Addition:    "+calculator.add(1,2));
        System.out.println("Subtraction: "+calculator.sub(2,3));
        System.out.println("Multiply:    "+calculator.mult(3,4));
        System.out.println("Divide:      "+calculator.div(12,6));

    }
}
