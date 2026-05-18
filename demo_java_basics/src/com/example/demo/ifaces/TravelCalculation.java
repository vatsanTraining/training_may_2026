package com.example.demo.ifaces;

import com.example.demo.model.TravelPackage;

public class TravelCalculation implements Calculation<TravelPackage> {

	@Override
	public double calculate(TravelPackage arg) {
		
		return arg.getBasePrice() * arg.getTravelerCount();
		
	}

	
	

}
