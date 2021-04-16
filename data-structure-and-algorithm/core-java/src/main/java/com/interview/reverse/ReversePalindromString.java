package com.interview.reverse;

public class ReversePalindromString {

	public static void main(String[] args) {
		String s = "mom";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}
}
