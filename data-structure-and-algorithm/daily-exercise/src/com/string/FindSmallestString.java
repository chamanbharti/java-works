package com.string;

public class FindSmallestString {
	static int index=0;
	public static void main(String [] args) {
        String [] s = {"hello", "goodbye", "jack", "bye", "yes", "no", "yoo"};
        System.out.println("The shortest word is: " + smallest(s));
        System.out.println("The shortest word's index is: " + index);
    }

    public static String smallest(String s[]) {
    	
    	String small = s[0];
        for (int i = 1 ; i < s.length ; i++) {
            // if ((s[i].length()<small.length())) {
        	if ((small.length() > s[i].length())) {
            	small = s[i];
            	index=i;
            }
        }
        return small;
        
    }
    	
}
