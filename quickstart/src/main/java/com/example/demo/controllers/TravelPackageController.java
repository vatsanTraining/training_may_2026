package com.example.demo.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TravelPackage;
import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.services.TravelService;

@RestController
@RequestMapping(path = "/api/v1/tours")
public class TravelPackageController {

	
	@Autowired
	TravelService service ;
	
	
	@GetMapping
	ResponseEntity<Collection<TravelPackage>> findAll() throws RangeCheckException{
		
		return ResponseEntity.ok(service.findAll());
	}
}
