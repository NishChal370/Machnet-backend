package com.example.Springassignment1.task4;

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayAddress(){
        System.out.println("Address is: "+getAddress());
    }

    @Override
    public String toString() {
        return address ;
    }
}
