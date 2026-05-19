package org.training;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data

public class TravelAgent {

	
	private int id;
	private String firstName;
	private long mobileNumber;
	
	private Address address;
	
	
	
}
