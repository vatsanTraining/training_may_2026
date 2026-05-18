package com.example.demo.ifaces;

import com.example.demo.model.TravelPackage;

public class CurrencyConverter implements Calculation<Double> {

	@Override
	public double calculate(Double arg) {
		return arg *90;
	}

}
