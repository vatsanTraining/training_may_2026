package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.exceptions.RangeCheckException;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx=	SpringApplication.run(QuickstartApplication.class, args);
	

	
	System.out.println("IoC Container -Ref =>"+ctx.getClass().getName());
	
	
	
	 TravelPackage beanOne =  (TravelPackage)ctx.getBean("travelPackage");
	 
	 System.out.println(beanOne);
	 

	 TravelPackage beanTwo =  ctx.getBean("beanTwo",TravelPackage.class);

	 System.out.println(beanTwo);

	 
	 TravelPackage beanThree =  ctx.getBean("beanThree",TravelPackage.class);
	 
	 System.out.println(beanThree);
	 
	 
	  
	
	ctx.close();
	}

	@Bean
	TravelPackage  beanTwo() throws RangeCheckException {
		
		return new TravelPackage("australia", 56000, 2, false);
	}
	
@Bean	
TravelPackage  beanThree() throws RangeCheckException {
		
		return new TravelPackage("srilanka", 76000, 3, true);
	}
}
