package com.learnreactivespring.model;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document
public class User {

   // @Id
    private String id;

    private String name;
    private int age;
    private double salary;

    public User(){

    }

    public User(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}