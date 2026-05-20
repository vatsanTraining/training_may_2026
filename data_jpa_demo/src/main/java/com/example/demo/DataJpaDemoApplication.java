package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TravelPackage;
import com.example.demo.ifaces.TravelPackageRepo;

@SpringBootApplication
public class DataJpaDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(DataJpaDemoApplication.class, args);
	
	
	   
	
	
	}

	
	@Bean
	CommandLineRunner commandLineRunner(TravelPackageRepo repo) {
		return args -> {
		
			repo.save(new TravelPackage(3010L,"bali", 55000, 2, true));
		};
	}
	
}
