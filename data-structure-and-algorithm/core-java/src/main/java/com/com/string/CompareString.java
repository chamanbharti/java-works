package com.string;

	import java.io.*;
	public class CompareString 
	{
	    public static void main(String[] args)throws IOException 
	    {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	         System.out.println("Enter First String:");
	         String str1 = bf.readLine();
	         System.out.println("Enter second String:");
	         String str2 = bf.readLine();
	         if ( str1.compareTo(str2) ==0 )
	            System.err.println("strings are equal");
	        else
	            System.err.println("strings are not equal");
	    } 
	}

