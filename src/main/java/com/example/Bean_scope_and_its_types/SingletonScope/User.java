package com.example.Bean_scope_and_its_types.SingletonScope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope("singleton")
public class User {

    public User(){
        System.out.println("User initilaization");
    }

    @PostConstruct
    public void init(){
        System.out.println("User object hashCode: "+this.hashCode());
    }
}
