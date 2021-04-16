package com.interview.exception;

public class ThrowInTry {
	public int myMethod() {
		try {
			throw new Exception("sdf");
		} finally {
			return 10;
		}
	}
	public static void main(String[] args) {
		ThrowInTry myTest = new ThrowInTry();
		int returnedValue = myTest.myMethod();
		System.out.println("The return Value : " + returnedValue);
	}
}
