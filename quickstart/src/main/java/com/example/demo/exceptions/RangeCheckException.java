package com.example.demo.exceptions;

import org.w3c.dom.ranges.RangeException;

//public class RangeCheckException extends RuntimeException {
//
//	
//	private String message;
//
//	public RangeCheckException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String getMessage() {
//		return message.toUpperCase();
//	}
//	
//	
//}

public class RangeCheckException extends Exception {

	
	private String message;

	public RangeCheckException(String message) {
		super(message);
		this.message=message;
	}

	@Override
	public String getMessage() {
		return message.toUpperCase();
	}
	
	
}