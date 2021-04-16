package com.string;

public class FindLargestSmallestString {
	
	public static void main(String[] args) {
		
		 String [] s = {"hello", "goodbye", "jack", "bye", "yes", "no", "yoo"};
	     largest1(s);
	     System.out.println("The large word is: " + largest1(s));
	     largest2(s);
	     System.out.println("The large word is: " + largest2(s));
	     
	     small(s);
	     System.out.println("The small word is: " + small(s));
	}
	public static String largest1(String s[]) {
        String large = s[0];
        for (int i = 1 ; i < s.length ; i++) {
            // if ( (large.length() < s[i].length() ) ) {
        	if ( (s[i].length() > large.length() ) ) {
            	large = s[i];
            } 
        } 
        return large;
    }
	public static String largest2(String[] array) {
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
	public static String small(String s[]) {
        String small = s[0];
        for (int i = 1 ; i < s.length ; i++) {
            // if ((s[i].length()<small.length())) {
        	if ((small.length() > s[i].length())) {
            	small = s[i];
            }
        }
        return small;
    }

}
