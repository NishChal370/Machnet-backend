package com.example.weekendCrudOperation.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Table (name = "USER_TABLE")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int number;
    private String address;

    public User(int id, String name, String address, int number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public User(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
