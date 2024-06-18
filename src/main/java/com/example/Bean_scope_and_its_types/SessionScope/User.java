package com.example.Bean_scope_and_its_types.SessionScope;


import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {

    public User(){
        System.out.println("User initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("User object hashCode: "+this.hashCode());
    }

    public void dummyMethod(){

    }
}

