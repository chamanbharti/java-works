package com.interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 	
			isAnagram("Mother In Law", "Hitler Woman");
		 	isAnagram("keEp", "peeK");
		 
	        isAnagram("SiLeNt CAT", "LisTen AcT");
	 
	        isAnagram("Debit Card", "Bad Credit");
	 
	        isAnagram("School MASTER", "The ClassROOM");
	 
	        isAnagram("DORMITORY", "Dirty Room");
	 
	        isAnagram("ASTRONOMERS", "NO MORE STARS");
	 
	        isAnagram("Toss", "Shot");
	 
	        isAnagram("joy", "enjoy");
	}
	static void isAnagram(String s1,String s2) {
		String s1Copy = s1.replaceAll("\\s", "").toLowerCase();
		String s2Copy = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		
		if(s1Copy.length() != s2Copy.length()) {
			status = false;
		}else {
				char[] s1Array = s1Copy.toCharArray();
				//char[] s2Array = s2Copy.toLowerCase().toCharArray();
				//Arrays.sort(s1Array);
				//Arrays.sort(s2Array);
				//status = Arrays.equals(s1Array, s2Array);
				
				/*for(char c: s1Array) {
					int index = s2Copy.indexOf(c);
					if(index != -1) {
						s2Copy = s2Copy.substring(0, index)+s2Copy.substring(index+1,s2Copy.length());
						
					}else {
						status = false;
						break;
					}
				}*/
				
				StringBuilder sb = new StringBuilder(s2Copy);
				for(char c:s1Array) {
					int index = sb.indexOf(""+c);
					if(index != -1) {
						sb = sb.deleteCharAt(index);
					}else {
						status = false;
						break;
					}
				}
		}
		if(status) {
			System.out.println(s1+" and "+s2+" is Anagram");
		}else {
			System.out.println(s1+" and "+s2+" is not Anagram");
		}
	}
}
