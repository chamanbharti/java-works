package com.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.exception.InvalidFieldException;
import com.exception.InvalidHeaderFieldException;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	public String handleInvalidFieldException(InvalidFieldException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler
	public ResponseEntity<String> handleInvalidHeaderFieldException(InvalidHeaderFieldException exception) {
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED);
	}
}
