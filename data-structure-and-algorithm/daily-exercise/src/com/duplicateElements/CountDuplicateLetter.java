package com.duplicateElements;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Find duplicate letters in given string
public class CountDuplicateLetter {
	
	public static void main(String[] args) {
		System.out.println("Enter any string: ");
		String str=new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer>duplicateKeys = new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if(duplicateKeys.containsKey(ch)) {
				duplicateKeys.put(ch, duplicateKeys.get(ch)+1);
			}else {
				duplicateKeys.put(ch, 1);
			}
		}
		
		for(Map.Entry m:duplicateKeys.entrySet()) {
			System.out.println(m.getKey()+" occured "+m.getValue()+" times");
		}
	}

}
