package com.example.demo.dtos;

import org.hibernate.validator.constraints.Range;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotEmpty;

public record TravelPackgeResponseDto(String destination,
		double basePrice, int travelerCount) {

}
