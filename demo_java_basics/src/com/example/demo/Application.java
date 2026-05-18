/**
 * @author srivatsan
 */
package com.example.demo;

import java.io.File;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.ifaces.Calculation;
import com.example.demo.ifaces.CurrencyConverter;
import com.example.demo.ifaces.TravelCalculation;
import com.example.demo.io.TextFileService;
import com.example.demo.model.LuxuryPackage;
import com.example.demo.model.TravelPackage;

/**
 * This is a First Demo Done during the training session
 */
public class Application {

	/**
	 * @param <T>
	 * @param args
	 */
	
	
	public static <T> void print(Calculation<T> poly, T arg) {
		
		System.out.println(poly.calculate(arg));
	}
	
	
	
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
			europeTour = new TravelPackage("paris", 65000, 2, true);
			
			var fare = europeTour.getBasePrice() * europeTour.getTravelerCount();
			
			System.out.println("Amount To Pay =>"+ fare);
			
			
			LuxuryPackage usaTour  = new LuxuryPackage("Atlanta", 89000, 2, true, 20000);
			
			
			var usaFare = (usaTour.getTravelerCount()*usaTour.getBasePrice())
					 + usaTour.getGuideFees();
			
			
			
			var ausTour = new TravelPackage("australia", 55000, 2, true);

			Calculation<TravelPackage> calc = new TravelCalculation();
			
			
			print(calc,ausTour);
			
			Calculation<Double> currency = new CurrencyConverter();
			
              print(currency, 90.00);               
               
			
              
			
			System.out.println(usaFare);
			
			TextFileService service = new TextFileService();
			
			
			boolean result=service.writeToFile(new File("travel.txt"), ausTour);
			
			System.out.println("is Added To File =>"+ result);
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		
	}

	

}
