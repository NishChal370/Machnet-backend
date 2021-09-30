package com.example.Springassignment2.task2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentTaskTwo")//-> setting id of Student
@Scope(value = "prototype") //-> this component will be called only when  its object is called
public class Student {
    public Student() {
        System.out.println("I am from Task 2 student constructor. ");
    }
}
