package com.example.Bean_scope_and_its_types.SingletonScope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class TestController1 {

    @Autowired
    User user;

    public  TestController1(){
        System.out.println("TestController1 instance initialization");
    }
    @PostConstruct
    public void init(){
        System.out.println("TestController1 object hashCode : "+this.hashCode()+
                " User object hashCode: "+user.hashCode());
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetchUser Api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}














