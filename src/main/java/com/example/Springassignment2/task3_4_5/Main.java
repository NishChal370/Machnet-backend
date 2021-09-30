package com.example.Springassignment2.task3_4_5;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean(Student.class);

        student.displayInfo();
    }
}
