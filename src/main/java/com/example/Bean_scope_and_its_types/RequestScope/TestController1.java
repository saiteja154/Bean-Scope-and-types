package com.example.Bean_scope_and_its_types.RequestScope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
@Scope("request")
public class TestController1 {

    @Autowired
    User user;

    @Autowired
    Student student;

    public TestController1(){
        System.out.println("TestController1 instance initialization");
    }
    @PostConstruct
    public void init(){
        System.out.println("TestController1 object hashCode : "+this.hashCode()+
                " User object hashCode: "+user.hashCode()+"  Student hashCode : "+student.hashCode());
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetchUser Api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
