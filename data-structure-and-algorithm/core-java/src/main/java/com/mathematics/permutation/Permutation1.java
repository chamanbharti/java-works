package com.mathematics.permutation;

import java.util.Iterator;

public class Permutation1 {
	
	public static void main(String[] args) {
		
		String str = "JSP";
		int len = str.length();  
        System.out.println("All the permutations of the string are: ");  
        generatePermutation(str, 0, len); 
	}

	private static void generatePermutation(String str, int start, int end) {
		int count = 1;
		//Prints the permutations 
		if(start == end-1) {
			System.out.println(str);
		}else {
			for (int i = start;i<end;i++) {
				//Swapping the string by fixing a character  
				str = swapString(str,start,i);
				//Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
                count++;
			}
		}
	}
	 //Function for swapping the characters at position I with character at position j
	private static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}
	
}
