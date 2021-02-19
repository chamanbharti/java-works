package com.string;

public class CaptalizeEachWord {

	public static void main(String[] args) {
		
		String s="hello chaman bharti";
		StringBuilder result=new StringBuilder(s.length());
		
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++){
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
		System.out.println(s);
		System.out.println(result);
	}
}
