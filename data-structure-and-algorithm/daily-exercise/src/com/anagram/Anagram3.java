package com.anagram;

import java.util.HashMap;

public class Anagram3 {
	public static void main(String[] args) throws Exception{
		
			isAnagram("now","own");
	}
	
	static void isAnagram(String first, String second){
		//remove all white spaces & converts strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();
		
		//check whether string lengths are equal or not, if unequal then not anagram
		if(first.length()!=second.length()){
			System.out.println(first+" and "+second+" are not anagrams.");
		 return;
		}else{
			
			HashMap mapOne = createMapKeys(first);
			HashMap mapTwo = createMapKeys(second);
				
				if(mapOne.equals(mapTwo)) {
					System.out.println(first+" and "+second+" are anagrams.");
				}
				else {
					System.out.println(first+" and "+second+" are not anagrams.");
				}
				
			}
	}
	public static HashMap createMapKeys(String str) {
		HashMap map = new HashMap();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = (int)map.get(str.charAt(i));
				map.put(str.charAt(i), count+1);
			}else {
				map.put(str.charAt(i), 0);
			}
		}
		return map;
	}
}
