package com.example.Bean_scope_and_its_types.IssueInRequestScopeWithSingleton;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
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