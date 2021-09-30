package com.example.Springassignment2.task3_4_5;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

//
@Component
@Scope(value = "prototype")
public class Student {

    @Value("${task_three_address.student_name}")
    private String studentName;
    @Value("${task_three_address.student_id}")
    private int studentId;
    @Autowired
    private Address address;
    @Autowired
    @Qualifier("javaScript")
    private Programming programming;
    @Value("${task_three_address.company}")
    private String company;

    public void displayInfo() {
        System.out.println("\nStudent ID: " + studentId+"\nStudent name: " + studentName);
        address.displayAddress();
        programming.programming();
    }

}
