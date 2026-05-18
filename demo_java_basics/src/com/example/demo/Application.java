/**
 * @author srivatsan
 */
package com.example.demo;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.model.LuxuryPackage;
import com.example.demo.model.TravelPackage;

/**
 * This is a First Demo Done during the training session
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		/*
		 * Multiple line comment
		 * I will be exploring variables here
		 */
		
		Greeting grtObj = new Greeting();
		
		
		System.out.println(grtObj.getMessage());

		TravelPackage europeTour;
		try {
			europeTour = new TravelPackage("paris", 45000, 2, true);
			
			var fare = europeTour.getBasePrice() * europeTour.getTravelerCount();
			
			System.out.println("Amount To Pay =>"+ fare);
			
			
			LuxuryPackage usaTour  = new LuxuryPackage("Atlanta", 89000, 2, true, 20000);
			
			
			var usaFare = (usaTour.getTravelerCount()*usaTour.getBasePrice())
					 + usaTour.getGuideFees();
			
			System.out.println(usaFare);
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		
	}

}
