package com.example.Bean_scope_and_its_types.PrototypeScope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    User user;

    public Student(){
        System.out.println("Student instance initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student object hashCode : "+this.hashCode()+
                " User object hashCode: "+user.hashCode());
    }
}
