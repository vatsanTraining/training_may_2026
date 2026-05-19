package org.training;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	
	private String lineOne;
	private String lineTwo;
	private String city;
	private long pincode;
	
	
}
