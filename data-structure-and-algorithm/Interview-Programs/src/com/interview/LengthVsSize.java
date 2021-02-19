package com.interview;

import java.util.ArrayList;

public class LengthVsSize {
	public static void main(String[] args) { 
		ArrayList<String> arrList = new ArrayList<String>(); 
		String[] items = { "One", "Two", "Three", "Four", "Five" }; 
		
		for(String str: items){
			arrList.add(str); 
			} 
		
		String s="Chaman";
		int sLength=s.length();
		//int size = items.size(); 
		int arraySize = items.length; 
		int arrayListSize=arrList.size();
		System.out.println("Size of String:"+sLength);
		System.out.println("Size of Array:"+arraySize); 
		System.out.println("Size of ArrayList:"+arrayListSize);
		}


}
