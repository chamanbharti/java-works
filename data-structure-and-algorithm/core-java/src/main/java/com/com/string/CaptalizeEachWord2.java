package com.string;

public class CaptalizeEachWord2 {

	public static void main(String[] args) {
		
		String s1="hello chaman bharti";
		char[] chars = s1.toCharArray();
		
		//all way make first char a capital
		chars[0] = Character.toUpperCase(chars[0]);
		
		//then capitalize if space on left
		for(int i=1;i<chars.length;i++){
			if(chars[i-1] == ' '){
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		
		String s2 = new String(chars);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
