/**
 * @author srivatsan
 */
package com.example.demo;

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
		
		String destination ="Paris";
		double basePrice = 50000;
		int travelerCount =1;
		boolean isFirstTimeTraveller = true;
		
		System.out.println(grtObj.getMessage());
		
		var fare = basePrice * travelerCount;
		
		System.out.println("Amount To Pay =>"+ fare);
		
		
	}

}
