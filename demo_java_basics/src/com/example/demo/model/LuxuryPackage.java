package com.example.demo.model;

import com.example.demo.exceptions.RangeCheckException;

public class LuxuryPackage extends TravelPackage {

	private double guideFees;

	public LuxuryPackage(String destination, double basePrice, int travelerCount, boolean isFirstTimeTraveller,
			double guideFees) throws RangeCheckException {
		super(destination, basePrice, travelerCount, isFirstTimeTraveller);
		this.guideFees = guideFees;
	}

	public double getGuideFees() {
		return guideFees;
	}

	public void setGuideFees(double guideFees) {
		this.guideFees = guideFees;
	}
	
	
	
}
