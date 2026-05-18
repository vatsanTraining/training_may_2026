package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
	
	ApplicationContext ctx=	SpringApplication.run(QuickstartApplication.class, args);
	
	
	
	System.out.println("IoC Container -Ref =>"+ctx.getClass().getName());
	}

}
