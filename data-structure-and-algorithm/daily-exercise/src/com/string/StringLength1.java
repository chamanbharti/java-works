package com.string;

public class StringLength1 {
	static int i,c,res;
	public static int length(String s){
			for(char ch:s.toCharArray())
				i++;
		return i;
	}
	public static void main(String[] args) {
		System.out.println("Original String is: ");
		System.out.println("Alives awesome ");
		res=StringLength2.length("Alive is awesome");
		System.out.println("Total Length:"+res);
	}

}
