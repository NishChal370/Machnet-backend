package com.example.Springassignment1.task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanstask3.xml");

        Student student3 = context.getBean("student3", Student.class);
        System.out.println(student3);
    }
}
