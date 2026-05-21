package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dtos.TravelPackgeResponseDto;
import com.example.demo.entity.TravelPackage;

public interface TravelPackageRepo extends JpaRepository<TravelPackage, Long> {

	//DSL Query
	
	List<TravelPackage>  findByDestination(String srchString);
	  
	//Custom Query with native SQL
	
	@Query(value = "select * from travel_may_2026 where is_first_time_traveller=true",nativeQuery = true)
	
	List<TravelPackage> fetchFirstTimeGuests();
	
	
	
	// Query with Projection
	
	//select basePrice,destination,travelCount from TravelPackage where travelCount>1
	
	// select basePrice,destination,travelCount loosely to mapped to the record
	
	// findByTravelerCountGreaterThan loosely mapped to travelerCount>
	
	// srchValue is mapped to parameter of the method
	
	List<TravelPackgeResponseDto> findByTravelerCountGreaterThan(int srchValue);
	
	// DML Query with Modifying ,Transaction
	
	
	// Custom Query with JPQL

}


