package com.example.demo.controllers;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.example.demo.dtos.TravelPackageDto;
import com.example.demo.dtos.TravelPackgeResponseDto;
import com.example.demo.entity.*;
import com.example.demo.services.TravelService;

import jakarta.validation.Valid;

import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.on;

@RestController
@RequestMapping(path = "/api/v1/tours")
public class TravelPackageController {

	
	@Autowired
	TravelService service ;
	
	
	@GetMapping
	ResponseEntity<Iterable<TravelPackageDto>> findAll() {
		
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping(path = "/{id}")
	ResponseEntity<TravelPackageDto> findById(@PathVariable Long id) {
		
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping(path = "/srch/destination/{srchString}")
	ResponseEntity<List<TravelPackageDto>> findByDestination(@PathVariable String srchString) {
		
		return ResponseEntity.ok(service.findByDestination(srchString));
	}
	
	@GetMapping(path = "/srch/count/{value}")
	ResponseEntity<List<TravelPackgeResponseDto>> findByTravelerCounty(@PathVariable int  value) {
		
		return ResponseEntity.ok(service.findByTravelCount(value));
	}
	
	@GetMapping(path = "/srch/first")
	ResponseEntity<List<TravelPackageDto>> findFirstTimeTravel(){
		return ResponseEntity.ok(service.fetchFirstTimeGuests());
	}
	
	 @GetMapping(path = "/paginated")
	    public ResponseEntity<Page<TravelPackageDto>> getAllPackages(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "10") int size) {
	        
	        Page<TravelPackageDto> paginatedResult = service.findAllWithPaging(page, size);
	        return ResponseEntity.ok(paginatedResult);
	    }
	@PostMapping
	ResponseEntity<TravelPackageDto> save(@Valid @RequestBody TravelPackageDto entity){
		
//		return ResponseEntity
//				   .status(HttpStatusCode.valueOf(201))
//				     .body(service.save(entity));
		
		 TravelPackageDto saved = service.save(entity);

		 URI location = MvcUriComponentsBuilder
				 .fromMethodCall(on(TravelPackageController.class)
						 .findById(saved.id())).build().toUri();
						 
						 
		     return ResponseEntity.created(location).body(saved);
		     
		
	}
		@PutMapping
		public ResponseEntity<TravelPackageDto> update(@PathVariable Long id,@RequestBody TravelPackageDto dto){
			
		          return ResponseEntity.ok().body(service.update(id, dto));
		}
		 
	
	@PatchMapping(path = "/{id}/{updatedPrice}")
	public ResponseEntity<String> updatePrice(@PathVariable Long id,@PathVariable double updatedPrice){
		
		return ResponseEntity.ok("Updated=> "+service.updateBasePrice(id, updatedPrice));
	}
	
	@DeleteMapping
	ResponseEntity<Void> removeById(@PathVariable Long id){
		
		 service.removeByid(id);
		 
         
      return ResponseEntity.noContent().build();

	}
	
}
