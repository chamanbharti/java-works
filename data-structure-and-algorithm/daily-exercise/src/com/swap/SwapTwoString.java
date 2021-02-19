package com.swap;

public class SwapTwoString {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		String temp = "";
		
		System.out.println("Strings before swap: a= "+a+" and b= "+b);
		// append 2nd string to 1st
		/*//method 0
		temp = a;
		a = b;
		b = temp;*/
		//method 1
		/*
		a = a+b;
		//store initial string a in string b
		b = a.substring(0, a.length() - b.length());
		//store initial string b in string a
		//a = a.substring(b.length());
		a = a.substring(b.length(),a.length());*/
		
		/*a=a+b;
        b=a.substring(0,len1);
        s1=s1.substring(len1);
        http://www.guideforschool.com/12128-swapping-two-strings-without-using-third-variable/
        */
        
		//method 2
		//a = a+b;
		/*a = a.concat(b);
		b = a.replace(b, "");
		a = a.replace(b, "");*/
		
		//method 3
		a = returnFirst(b,b=a);
		
		System.out.println("Strings After swap: a= "+a+" and b= "+b);// If this is confusing try reading as a=b; b=a;
	}

	private static String returnFirst(String a, String b) {
		
		return a;
	}

}
