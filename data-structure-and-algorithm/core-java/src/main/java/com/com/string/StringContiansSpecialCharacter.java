package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContiansSpecialCharacter {

	public static void main(String[] args) {
		
		  //using regrex
//		  Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		 Pattern pattern = Pattern.compile("[0-9]*");
//		 Pattern pattern = Pattern.compile("[a-zA-Z]*");
		 
	      String str = "1234";
	      Matcher matcher = pattern.matcher(str);
	 
	      if (matcher.matches()) {
	           System.out.println("string '"+str + "' contains special character");
	      } else {
	           System.out.println("string '"+str + "' doesn't contains special character");
	      }
	}
}
