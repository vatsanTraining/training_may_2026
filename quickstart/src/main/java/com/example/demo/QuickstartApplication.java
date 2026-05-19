package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.training.TravelAgent;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.services.TravelService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","org.training"})
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
	 
	 
	 TravelAgent agent = ctx.getBean(TravelAgent.class);
	 
	 System.out.println(agent);
	  
	 
	 try {
		ctx.getBean(TravelService.class).findAll().forEach(System.out::println);
	} catch (BeansException e) {
		e.printStackTrace();
	} catch (RangeCheckException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	
	//ctx.close();
	}

	
}
