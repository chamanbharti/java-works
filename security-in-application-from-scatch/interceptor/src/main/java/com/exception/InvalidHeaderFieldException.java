package com.exception;

public class InvalidHeaderFieldException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message;

	public InvalidHeaderFieldException(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
