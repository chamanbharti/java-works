package com.anagram;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) throws Exception{
		
			boolean result = isAnagram("now","own");
			System.out.println(result);
	}
	
	static boolean isAnagram(String first, String second){
		//remove all white spaces & converts strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();
		
		//check whether string lengths are equal or not, if unequal then not anagram
		
		if(first.length()!=second.length()){
		 return false;
		}else{
			//convert first string to char array
			char[] firstArray = first.toLowerCase().toCharArray();
			
			//check whether each character of first array is present in second string
			for(char c:firstArray) {
				int index = second.indexOf(c);
				
				//indexOf function returns -1 if the character is not found
				if(index == -1) {
					return false;
				}
				else {
					//if character is present in second string , remove that character from second string
					second = second.substring(0,index) + second.substring(index+1, second.length());
				}
				
			}
		}
		return true;
	}

}
