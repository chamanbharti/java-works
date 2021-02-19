package com.anagram;

import java.util.Arrays;

public class Anagram1 {
	public static void main(String[] args) throws Exception{
		
			boolean result = isAnagram("now","own");
			System.out.println(result);
	}
	
	static boolean isAnagram(String first, String second){
		//removing all white spaces & converts strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();
		
		//check whether string lengths are equal or not, if unequal then not anagram
		
		if(first.length()!=second.length()){
		 return false;
		}else{
			//convert string to char array
			char[] firstArray = first.toLowerCase().toCharArray();
			char[] secondArray = second.toLowerCase().toCharArray();
			
			//sorting both Arrays
			Arrays.sort(firstArray);
			Arrays.sort(secondArray);
			
			//checking whether both strings are equal or not
			return Arrays.equals(firstArray, secondArray);
		}
	}

}
