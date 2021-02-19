package com.interview.string;

public class IsStringImmutable {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		System.out.println(b);
		b = "def";
		System.out.println(a+", "+b);
	}
}
