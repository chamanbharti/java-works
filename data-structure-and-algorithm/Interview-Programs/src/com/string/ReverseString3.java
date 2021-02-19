package com.string;

import java.io.IOException;

public class ReverseString3 {
	public static void main(String[] args){
		
		ReverseString3 rv = new ReverseString3();
		String blogName = "Java Reverse";
		System.out.println("Original String is :"+blogName);
		String reverse = rv.recursiveReverse(blogName);
		System.out.println("Reverse of Java Reverse is: "+reverse);
		
	}

	private String recursiveReverse(String blogName) {
		if(blogName.length() == 1)
			return blogName;
		else
			return blogName.charAt(blogName.length()-1) + recursiveReverse(blogName.substring(0,blogName.length()-1));
		
	}
}
