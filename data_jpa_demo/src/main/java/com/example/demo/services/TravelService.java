package com.example.demo.services;


import org.springframework.stereotype.Service;

import com.example.demo.entity.TravelPackage;
import com.example.demo.ifaces.TravelPackageRepo;


@Service
public class TravelService {

	
	private TravelPackageRepo repo;

	
	
	
	public TravelService(TravelPackageRepo repo) {
		super();
		this.repo = repo;
	}
	public Iterable<TravelPackage> findAll() {
		
		return this.repo.findAll();
	}
	
	public TravelPackage  save(TravelPackage entity) {
		
		return this.repo.save(entity);
	}
	
	public TravelPackage findById(Long id) {
		
		return this.repo.findById(id)
				 .orElseThrow(()-> new RuntimeException("Element with Given Id Not Found"));
	}
}
