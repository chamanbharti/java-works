package com.interview;

public class CountLetter {

	
	public static void main(String[] args) {
		characterCount("Hello World");
		//characterCount("All Is Well");
	   // characterCount("Done And Gone");
	}
	public static void characterCount(String inputString) {
		int count=0;
		String s = inputString;
		for(char i='a'&'A';i<='z';i++){
		for(int j=0;j<s.length()-1;j++){
			if(s.charAt(j)==i){
			count++;
			}
			}
			if(count!=0){
				System.out.print(i+"="+count+" ");
				count=0;
				}
			}
		}									
}