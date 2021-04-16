package com.junit.hello_world;

public class Calculator {

	public int evaluate(String expression) {
		int sum =0;
		for(String sumAnd : expression.split("\\+")) {
			sum += Integer.valueOf(sumAnd);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
		System.out.println(sum);
	}
}
