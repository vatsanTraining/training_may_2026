package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dtos.TravelPackgeResponseDto;
import com.example.demo.entity.TravelPackage;

public interface TravelPackageRepo extends JpaRepository<TravelPackage, Long> {

	//DSL Query
	
	List<TravelPackage>  findByDestination(String srchString);
	  
	//Custom Query with native SQL
	
	// Custom Query with JPQL
	
	// Query with Projection
	
	List<TravelPackgeResponseDto> findByTravelerCountGreaterThan(int srchValue);
	
	// DML Query with Modifying ,Transaction
}


