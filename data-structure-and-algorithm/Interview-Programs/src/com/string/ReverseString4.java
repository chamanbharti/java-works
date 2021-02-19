package com.string;

import java.io.IOException;

public class ReverseString4 {
	public static void main(String[] args) throws IOException{
		
		ReverseString4 rv = new ReverseString4();
		String blogName = "Java Reverse";
		System.out.println("Original String is :"+blogName);
		StringBuffer sb = new StringBuffer(blogName);
		System.out.println("Reverse of Java Reverse is: "+sb.reverse());
		
	}

	
}
