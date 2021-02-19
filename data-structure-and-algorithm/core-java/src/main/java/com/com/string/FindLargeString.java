package com.string;

public class FindLargeString {
	static int index=0;
	public static void main(String [] args) {
        String [] s = {"chaman", "aman", "good", "bye", "joy", "no", "yes"};
        System.out.println("The largest word is: " + largest(s));
        System.out.println("The largest index is: " + index);
    }

    public static String largest(String s[]) {
        String large = s[0];
        for (int i = 1 ; i < s.length ; i++) {
            // if ( (large.length() < s[i].length() ) ) {
        	if ( (s[i].length() > large.length() ) ) {
            	large = s[i];
            	index=i;
            } 
        } 
        return large;
    }
}
