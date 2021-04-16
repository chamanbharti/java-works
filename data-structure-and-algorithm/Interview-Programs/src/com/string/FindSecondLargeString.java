package com.string;

public class FindSecondLargeString {
	static int i;
	static int j;
	static int secondLarge;
	static int size;
	
	public static void main(String [] args) {
        String [] s = {"chaman", "aman", "good", "bye", "joy", "no", "yes"};
        size=s.length;
        System.out.println("The first largest word is: " +  largest(s));
       // System.out.println("The second largest word is: " +  secondLargest(s));
       
        
    }

    public static String largest(String s[]) {
        String firstLarge = s[0];
        for (i = 1 ; i < s.length ; i++) {
            // if ( (large.length() < s[i].length() ) ) {
        	if ( (s[i].length() > firstLarge.length() ) ) {
        		firstLarge = s[i];
            	j=i;
            } 
        }
        return firstLarge;
        
    }
    /*public static String secondLargest(String s[]) {
        String secondLarge = s[size-j-1];
        for (i = 1 ; i < s.length ; i++) {
            // if ( (large.length() < s[i].length() ) ) {
        	if ( (s[i].length() > large.length() ) ) {
            	large = s[i];
            	j=i;
            } 
        	if(secondLarge < s[i] && j!= i){
				secondBig = no[i];
			}
        }
        return large;
        
    }*/
}
