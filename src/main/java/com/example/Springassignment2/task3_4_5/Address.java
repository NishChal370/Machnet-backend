package com.example.Springassignment2.task3_4_5;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Address {
    @Value("${task_three_address.address_name}")
    private String addressName;
    @Value("${task_three_address.address_id}")
    private int addressId;

    public void displayAddress(){
        System.out.println("Address ID: "+addressId+"\nAddress: "+ addressName);
    }

}
