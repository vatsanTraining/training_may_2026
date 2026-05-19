package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TravelPackage;
import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.repo.TravelPackageRepoistory;

@Service
public class TravelService {

	
	private TravelPackageRepoistory repo;

	
	
	

	// Constructor DI is Done here , since the class
	// has only one constructor no need to add a @AutoWired annotation

	public TravelService(TravelPackageRepoistory repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<TravelPackage> findAll() throws RangeCheckException{
		
		return this.repo.getPackages();
	}
	
}
