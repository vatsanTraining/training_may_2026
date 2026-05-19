package com.example.demo.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.TravelPackage;
import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.repo.TravelPackageListRepoistory;
import com.example.demo.repo.TravelRepo;

@Service
public class TravelService {

	
	private TravelRepo repo;

	
	
	

	// Constructor DI is Done here , since the class
	// has only one constructor no need to add a @AutoWired annotation

	// USE THIS CONSTRUCTOR IF THERE IS ONLY ONE IMPLEMENTATION OF THE INTERFACE
//	public TravelService(TravelRepo repo) {
//		super();
//		this.repo = repo;
//	}
	
	// USE THIS CONSTRUCTOR IF THERE ARE MORE THAN ONE IMPLEMENTATION OF THE INTERFACE

//	public TravelService(@Qualifier("travelPackageListRepoistory") TravelRepo repo) {
//		super();
//		this.repo = repo;
//	}
//	
	// USE THIS CONSTRUCTOR WHEN YOU ADD @PRIMARY ANNOTATION ON ONE OF THE IMPLEMENTATION
	public TravelService(TravelRepo repo) {
		super();
		this.repo = repo;
	}
	public Collection<TravelPackage> findAll() throws RangeCheckException{
		
		return this.repo.getPackages();
	}
	
}
