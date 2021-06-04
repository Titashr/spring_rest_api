package com.example.restAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.restAPI.controller.EmployeeController;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		context.getBean(EmployeeController.class);
		
	}

}
