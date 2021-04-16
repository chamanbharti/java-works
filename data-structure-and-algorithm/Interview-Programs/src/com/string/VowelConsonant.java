package com.string;

public class VowelConsonant {
	public static void main(String[] args) {
		 String str = "ChAmAn";
		 int vowel=0;
		 int consonant=0;
		 
		 for(int i=0;i<str.length();i++){
			 char c = str.charAt(i);
			 if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
				 vowel++;
			 }else{
				 consonant++;
			 }
		 }
		 System.out.println("Total vowels: "+vowel+" and total consonants: "+consonant);
	}
	

}
