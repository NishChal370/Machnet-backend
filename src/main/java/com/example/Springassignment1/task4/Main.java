package com.example.Springassignment1.task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student4 = applicationContext.getBean("student4",Student.class);
        student4.findAddress();
        System.out.println(student4);
    }
}
