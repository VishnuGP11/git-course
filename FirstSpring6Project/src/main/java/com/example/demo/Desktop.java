package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;


@Component
// @Primary
public class Desktop implements Computer{

	@Override
	public void compile() {
		System.out.println("Compiles the project faster");
	}

}
