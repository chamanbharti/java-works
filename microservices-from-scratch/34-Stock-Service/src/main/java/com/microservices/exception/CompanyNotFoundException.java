package com.microservices.exception;

public class CompanyNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompanyNotFoundException(String str) {
		super(str);
	}

}
