package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.example.demo.services.TravelService;

@RestController
@RequestMapping(path = "/api/v1/tours")
public class TravelPackageController {

	
	@Autowired
	TravelService service ;
	
	
	@GetMapping
	ResponseEntity<Iterable<TravelPackage>> findAll() {
		
		return ResponseEntity.ok(service.findAll());
	}
}
