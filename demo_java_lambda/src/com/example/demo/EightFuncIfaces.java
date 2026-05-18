package com.example.demo;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class EightFuncIfaces {

	public static void main(String[] args) {

		
		List<String> names = List.of("Ram","Shyam","Sita","Geetha");
		

		List<String> city = List.of("Ram","Shyam","Sita","Geetha");

		for(String eachString:names) {
			System.out.println(eachString);
		}
	
		Consumer<String> printer = (e) -> System.out.println(e);
		
		

		names.forEach(printer);
		city.forEach(printer);
		
		
		names.forEach(System.out::println);
		
		
		Calculation<Double> cal = (arg) -> arg *20;
		
		System.out.println("Custom Func "+cal.calculate(50.00));
		
		
		Function<Double, Double> cal2 = (arg) -> arg*30;
		
		System.out.println("Buit in Func"+cal2.apply(50.00));
		
		
	}

}
