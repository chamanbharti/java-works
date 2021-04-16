package com.interview;

public class EqualsDoubleOperator {
	
	public static void main(String[] args) {
		
		String s = new String("Red");
		String b = new String("Blue");
		String n = "Red";
		s = n;
		
		System.out.println(s.equals(b));//true
		System.out.println(s == b);//false
	}

}
