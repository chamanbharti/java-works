package com.unique_elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindOnlyNumeric {
	public static void main(String[] args) throws IOException {
		int count=0;
		String result="";
		String str=null;
		System.out.print("Enter String : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='+' || str.charAt(i) =='-' || str.charAt(i) =='*'){
				count++;
				continue;
			}else{
				result = result + str.charAt(i);
			}
		}
		
		System.out.println("Result String is :"+result+" Other total symbol are :"+count);
	}

}
