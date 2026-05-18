package com.example.demo;

import java.util.List;
import java.util.function.Consumer;

public class EightFuncIfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> names = List.of("Ram","Shyam","Sita","Geetha");
		

		List<String> city = List.of("Ram","Shyam","Sita","Geetha");

		for(String eachString:names) {
			System.out.println(eachString);
		}
	
		Consumer<String> printer = (e) -> System.out.println(e);
		
		

		names.forEach(printer);
		city.forEach(printer);
		
		
		names.forEach(System.out::println);
		
		
		
	}

}
