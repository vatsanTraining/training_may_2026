package com.example.demo.model;

public class TravelPackage {

	private String destination ;
	private double basePrice ;
	private int travelerCount;
	private boolean isFirstTimeTraveller;
	
	public TravelPackage() {
		super();
	}
	public TravelPackage(String destination, double basePrice, int travelerCount, boolean isFirstTimeTraveller) {
		super();
		this.destination = destination;
		this.basePrice = basePrice;
		this.travelerCount = travelerCount;
		this.isFirstTimeTraveller = isFirstTimeTraveller;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public int getTravelerCount() {
		return travelerCount;
	}
	public void setTravelerCount(int travelerCount) {
		this.travelerCount = travelerCount;
	}
	public boolean isFirstTimeTraveller() {
		return isFirstTimeTraveller;
	}
	public void setFirstTimeTraveller(boolean isFirstTimeTraveller) {
		this.isFirstTimeTraveller = isFirstTimeTraveller;
	}
	
	
	
}
