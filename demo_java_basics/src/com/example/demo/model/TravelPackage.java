package com.example.demo.model;

import com.example.demo.exceptions.RangeCheckException;

public class TravelPackage {

	private String destination ;
	private double basePrice ;
	private int travelerCount;
	private boolean isFirstTimeTraveller;
	
	public TravelPackage() {
		super();
	}
	public TravelPackage(String destination, double basePrice, int travelerCount, boolean isFirstTimeTraveller) throws RangeCheckException {
		super();
		this.destination = destination;
		if(basePrice<0 || basePrice >50000) {
			throw new RangeCheckException("ERR-A101 Base Price should be in the range of 1-50000");
		} else {
		this.basePrice = basePrice;
		}
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
		
		try {
			if(basePrice<0 && basePrice >50000) {
				throw new RangeCheckException("ERR-A101 Base Price should be in the range of 1-50000");
			} else {
			this.basePrice = basePrice;
			}
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
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
