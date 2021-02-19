package com.string;

public class ReverseString2 {
	public static void main(String[] args){
		
		
		String blogName = "madam";
		String reverse ="";
		System.out.println("Original String is :"+blogName);
		for (int i = blogName.length()-1; i >= 0; i--) {
			reverse = reverse + blogName.charAt(i);
			
		}
		//System.out.println("Reverse String :"+reverse);
		if( blogName.equals(reverse) ){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}
