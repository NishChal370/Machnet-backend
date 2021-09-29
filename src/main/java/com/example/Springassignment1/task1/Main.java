package com.example.Springassignment1.task1;

import com.example.Springassignment1.task2.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) applicationContext.getBean("student");

        System.out.println(student);
    }
}
