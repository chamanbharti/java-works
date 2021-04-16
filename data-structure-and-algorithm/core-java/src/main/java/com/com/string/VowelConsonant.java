package com.string;

public class VowelConsonant {
	public static void main(String[] args) {
		 String str = "0C1h2A3m4A5n2";
		 int vowel=0;
		 int consonant=0;
		 int num=0;
		 for(int i=0;i<str.length();i++){
			 char c = str.charAt(i);
			 if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
				 vowel++;
			 }else if(c >= 48 && c <=57) {
				 num++;
			   }
			else{
				 consonant++;
			 }
		 }
		 System.out.println("Total vowels: "+vowel+" ,total consonants: "+consonant+" and numbers:"+num);
	}
	

}
