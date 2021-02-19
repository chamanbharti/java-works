package com.anagram;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String str = "Chaman	Bharti  Sahil  Bharti\n  Aman Bharti";
		//Method 1
		//1 Using replaceAll()
		String str2=str.replaceAll("\\s","");//it removes all
		//String str2=str.replace(" ", "");//it removes only space except tab
		System.out.println(str2);
		
		//Method 2
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<strArray.length;i++){
			if( (strArray[i] != ' ') && (strArray[i] != '\t') ){
				sb.append(strArray[i]);
			}
		}
		System.out.println(sb);
		
		//Method 3
		char[] strArray2 = str.toCharArray();
		StringBuffer sb2 = new StringBuffer();
		for(char c:strArray2){
			if(!Character.isWhitespace(c)){
				sb2.append(c);
			}
		}
		System.out.println(sb2);
	}
}
