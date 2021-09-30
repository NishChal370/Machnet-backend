package com.example.Springassignment2.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(studentConfig.class);
        Student hari = context.getBean("studentTaskTwo",Student.class);
        Student krishna = context.getBean("studentTaskTwo",Student.class);

        String hashCodeIs = (hari.hashCode() == krishna.hashCode()) ? "Same" : "not Same";
        System.out.print("Hash code of hari "+ hari.hashCode() +" and Hash code of krishna "+hari.hashCode()+" is "+hashCodeIs);
    }
}
