package com.string;

public class FindLargeString2 {

	public static void main(String[] args) {
		 String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
	      String longestString = getLongestString(toppings);
	      System.out.format("longest string: '%s'\n", longestString);
	}
	 public static String getLongestString(String[] array) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : array) {
	          //if (s.length() > maxLength) {
	          if (maxLength <s.length()) {
	              maxLength = s.length();
	              longestString = s;
	          }
	    	  
	      }
	      return longestString;
	  }

}
