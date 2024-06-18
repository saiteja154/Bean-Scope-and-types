package com.example.Bean_scope_and_its_types.IssueInRequestScopeWithSingleton;


import com.example.Bean_scope_and_its_types.IssueInRequestScopeWithSingleton.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// when we runthis package the application will fail ,
// because we made our User class as request scope which doesn't have request at the appliaction start time ,
// so it will give error.
// we use ProxyMode to solve this issue : it will inject dummy object of the user at the application start time.



@RestController
@RequestMapping(value = "/api/")
@Scope("singleton")
public class TestController1 {

    @Autowired
    User user;

    public TestController1(){
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


