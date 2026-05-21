package com.example.demo.dtos;

import org.hibernate.validator.constraints.Range;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotEmpty;

public record TravelPackageDto(long id,@NotEmpty String destination,
		@Schema(requiredMode = RequiredMode.REQUIRED,description = "base price should be 25000 to 250000")
		@Range(min = 25000, max = 250000,message = "base price should be 25000 to 250000")
double basePrice, int travelCount,boolean isFirstTimeTraveller) {

}

