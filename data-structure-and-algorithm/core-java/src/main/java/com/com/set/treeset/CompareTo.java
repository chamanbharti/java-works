package com.set.treeset;

public class CompareTo {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));//-25 if s1 < s2, it returns negative number  
		System.out.println("Z".compareTo("K"));//15 if s1 > s2, it returns positive number 
		System.out.println("A".compareTo("A"));//0 if s1 == s2, it returns 0  
		System.out.println("A".compareTo(null));//NullPointerException 
	}
}
