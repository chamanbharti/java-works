package com.comparator.journaldev;

import java.util.Arrays;

public class toString {
	public static void main(String[] args) {
		char[] Array = {'a', 'b', 'c', 'd', 'e', 'f'};
		//int[] Array = {5,9,1,10};
		/*System.out.println(Array.toString());//[C@15db9742
		System.out.println(Arrays.toString());*/
		
		//String a = new String(Array);
		//System.out.println(a);//abcdef
		convertToString(Array,6);
		System.out.println(Array);
	}

	private static String convertToString(char[] array, int length) {
		String char_string;
		String return_string = "";
		int i;
		for(i=0;i<length;i++){
			char_string = Character.toString(array[i]);
			return_string = return_string.concat(char_string);
			
		}
		return return_string;
	}
	

}
