package com.example.demo.repo;

import java.util.Collection;
import java.util.List;

import com.example.demo.TravelPackage;
import com.example.demo.exceptions.RangeCheckException;

public interface TravelRepo {

	
	public Collection<TravelPackage> getPackages() throws RangeCheckException;

}