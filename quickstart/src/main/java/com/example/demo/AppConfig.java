package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.training.Address;
import org.training.TravelAgent;

import com.example.demo.exceptions.RangeCheckException;

@Configuration
public class AppConfig {

	
	@Bean
	TravelPackage  beanTwo() throws RangeCheckException {
		
		return new TravelPackage("australia", 56000, 2, false);
	}
	
@Bean	
TravelPackage  beanThree() throws RangeCheckException {
		
		return new TravelPackage("srilanka", 76000, 3, true);
	}


@Bean
Address ramsAddress() {
	
	return new Address("Gandhi Nagar","thuraipakkam","chennai",600040);
}

@Bean
TravelAgent   agentOne(Address ramsAddress) {
	
	TravelAgent agent= new TravelAgent();
	
	agent.setId(101);
	agent.setFirstName("Ram");
	agent.setMobileNumber(9293939);
	agent.setAddress(ramsAddress);
	
	return agent;
}
}
