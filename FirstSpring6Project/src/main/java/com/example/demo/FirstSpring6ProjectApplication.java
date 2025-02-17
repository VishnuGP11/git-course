package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstSpring6ProjectApplication {

	public static void main(String[] args) {
		// this will go through the IOC contaioner and run the object inside it
		// it is of type ApplicationContext, so create object of it
//		SpringApplication.run(FirstSpring6ProjectApplication.class, args);
		
		ApplicationContext context =  SpringApplication.run(FirstSpring6ProjectApplication.class, args);
		
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
