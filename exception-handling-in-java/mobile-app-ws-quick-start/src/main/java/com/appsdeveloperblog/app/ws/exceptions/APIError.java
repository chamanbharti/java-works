package com.appsdeveloperblog.app.ws.exceptions;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

public class APIError {

	private HttpStatus status;
    private String message;
    private List<String> errors;
    
    public APIError(final HttpStatus status, final String message, final List<String>errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}
    
    public APIError(final HttpStatus status, final String message, final String error) {
  		super();
  		this.status = status;
  		this.message = message;
  		this.errors = Arrays.asList(error);
  	}
    
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(final HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(final String message) {
		this.message = message;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(final List<String> errors) {
		this.errors = errors;
	}
    
}
