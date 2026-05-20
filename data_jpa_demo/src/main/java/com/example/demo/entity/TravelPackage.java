package com.example.demo.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "travel_may_2026")
public class TravelPackage  {

	@Id
	
	private Long id;
	
	
	@Column(name = "destination",length = 20)
	private String destination ;
	
	@Column(name="base_price")
	private double basePrice ;
	
	@Column(name = "traveler_count")
	private int travelerCount;
	
	@Column(name = "is_first_time_traveller")
	private boolean isFirstTimeTraveller;
	
    
	public TravelPackage() {
		super();
		System.out.println("=========== Constructor Called =========");
	}
	public TravelPackage(String destination, double basePrice, int travelerCount, boolean isFirstTimeTraveller) 
			 {
		super();
		this.destination = destination;
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
	@Override
	public String toString() {
		return destination +" ,"+basePrice+","+travelerCount;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(basePrice, destination, isFirstTimeTraveller, travelerCount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelPackage other = (TravelPackage) obj;
		return Double.doubleToLongBits(basePrice) == Double.doubleToLongBits(other.basePrice)
				&& Objects.equals(destination, other.destination) && isFirstTimeTraveller == other.isFirstTimeTraveller
				&& travelerCount == other.travelerCount;
	}
	
	
}
