package com.anagram;

public class Anagram4 {
	public static void main(String[] args) throws Exception{
		
			boolean result = isAnagram("now","own");
			System.out.println("now and own is anagram");
	}
	
	static boolean isAnagram(String first, String second){
		//remove all white spaces & converts strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();
		
		char[] firstArray = first.toCharArray();
		StringBuilder sb = new StringBuilder(second);
		
		for(char c:firstArray){
			int index = sb.indexOf(""+c);
			
			if(index != -1) {
				sb.deleteCharAt(index);
			}else {
				return false;
			}
			
		}
		return sb.length() == 0 ? true:false;
	}
}
