package com.string;
//Java Example Program to remove all spaces from a String
public class RemoveSpaceFromString1 {
public static void main(String[] args) {
	String input=" Chaman Bharti ";
	String output=removeSpaces(input);
	
	System.out.println("Input: "+input);
	System.out.println("Output: "+output);
	
   }
   //Remove all space characters
   private static String removeSpaces(String input){
	   return input.replaceAll(" ", "");
   }
}
