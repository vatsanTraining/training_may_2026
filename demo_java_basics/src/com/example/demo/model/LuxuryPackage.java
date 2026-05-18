package com.example.demo.model;

public class LuxuryPackage extends TravelPackage {

	private double guideFees;

	public LuxuryPackage(String destination, double basePrice, int travelerCount, boolean isFirstTimeTraveller,
			double guideFees) {
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
