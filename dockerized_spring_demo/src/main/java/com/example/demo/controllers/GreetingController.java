package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/messages")
public class GreetingController {
	
	
	
	@GetMapping
	public String getMessage() {
		return "Welcome to Docker Demo";
	}

}
