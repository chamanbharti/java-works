package com.microservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StockPriceExceptionHandler {

	@ExceptionHandler(value=CompanyNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException() {
		return new ResponseEntity<String>("Company Not Found", HttpStatus.BAD_REQUEST);
	}

}
