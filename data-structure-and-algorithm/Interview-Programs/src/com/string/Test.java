package com.string;

public class Test {

	public static void main(String[] args) {
		 String str = "Chaman Bharti";
		 char[] chArray = str.toCharArray();
		 StringBuffer sb = new StringBuffer();
		 
		 for(int i=0;i<chArray.length;i++) {
			 if( (chArray[i]!='a') && (chArray[i]!='i')) {
				 sb.append(chArray[i]);
			 }
		 }
		 /*for(Character c:chArray) {
			 if(!Character.isWhitespace(c)) {
				 sb.append(c);
			 }
		 }*/
		 
		 System.out.println(sb);
		 
	}
}
