package com.example.demo.utils;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {

	
	
	@ExceptionHandler(exception = MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleEntityValidation(BindException ex,WebRequest req){
		
		Map<String,String> errors = new HashMap<>();
		
		ex.getBindingResult()
		.getFieldErrors()
		.forEach(e -> errors.put(e.getField(),e.getDefaultMessage()));
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}
	
	
	@ExceptionHandler(exception = RuntimeException.class)
	public ResponseEntity<Map<String,String>> handleRunTimeException(Exception ex,WebRequest req){
		
		Map<String,String> errors = new HashMap<>();

		errors.put("message", ex.getMessage());
		errors.put("time",LocalDateTime.now().toString());
		errors.put("uri", req.getDescription(false));
		
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
		
	}
}
