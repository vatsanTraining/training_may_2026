package com.example.demo;

import java.util.Objects;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.RangeCheckException;

@Component
//@Lazy
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TravelPackage  {

	private String destination ;
	private double basePrice ;
	private int travelerCount;
	private boolean isFirstTimeTraveller;
	
    
	public TravelPackage() {
		super();
		System.out.println("=========== Constructor Called =========");
	}
	public TravelPackage(String destination, double basePrice, int travelerCount, boolean isFirstTimeTraveller) throws RangeCheckException {
		super();
		this.destination = destination;
		if(basePrice<0 || basePrice >500000) {
			throw new RangeCheckException("ERR-A101 Base Price should be in the range of 1-500000");
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
				throw new RangeCheckException("ERR-A101 Base Price should be in the range of 1-500000");
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
