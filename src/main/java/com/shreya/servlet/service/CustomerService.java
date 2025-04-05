package com.shreya.servlet.service;

public class CustomerService {

    public String greet(String name) {
    if(name.isEmpty()){
        return  "hello all";
    }
    return "hello " + name;
}
}
