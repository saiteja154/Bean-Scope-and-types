package com.example.Bean_scope_and_its_types;

import com.example.Bean_scope_and_its_types.IssueInRequestScopeWithSingleton.User;
import com.example.Bean_scope_and_its_types.PrototypeScope.Student;
import com.example.Bean_scope_and_its_types.RequestScope.TestController1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(

		 //we use this for excluding the packages/ sub-class & etc ...
		basePackages = "com.example.Bean_scope_and_its_types",
		excludeFilters = @ComponentScan.Filter(
				type = FilterType.ASSIGNABLE_TYPE,
				classes = {
						   //singleton scope exclusion
						   com.example.Bean_scope_and_its_types.SingletonScope.TestController1.class,
						   com.example.Bean_scope_and_its_types.SingletonScope.TestController2.class,
						   com.example.Bean_scope_and_its_types.SingletonScope.User.class,
						   //prototype scope exclusion
						   com.example.Bean_scope_and_its_types.PrototypeScope.User.class,
						   com.example.Bean_scope_and_its_types.PrototypeScope.TestController1.class,
						   Student.class,
						   //  Request Scope exclusion
						   com.example.Bean_scope_and_its_types.RequestScope.Student.class,
  						   com.example.Bean_scope_and_its_types.RequestScope.User.class,
						   TestController1.class,
						   // Issue in request scope with singleton and used proxyMode to solve.
						   com.example.Bean_scope_and_its_types.IssueInRequestScopeWithSingleton.TestController1.class,
						   User.class

						/* directly it will execute the Session scope package class as we excluded the other class.

						 */
				})


)
public class BeanScopeAndItsTypesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanScopeAndItsTypesApplication.class, args);
	}

}
