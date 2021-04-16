package com.java8.supplier;

import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		
		Supplier<String> supplierStr = () -> {
			return "Hello World!";
		};
		System.out.println(supplierStr.get());
		
		Supplier<Number> supplierNum = () -> {
			return 40;
		};
		System.out.println(supplierNum.get());
	}
}
