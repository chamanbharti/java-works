package com.string;

import java.util.Arrays;

public class SortString {
	 public static void main(String[] args)
	    {
	        // args is the list of guests
	        Arrays.sort(args);
	        for(int i = 0; i < args.length; i++)
	            System.out.println(args[i]);
	    }
}
/*
 I ran that code using "java Test Bobby Joe Angel" and here is the output:
$ java SortString Ziva Yashmin Chaman Bharti Aman Sahil
Aman
Bharti
Chaman
Sahil
Yashmin
Ziva
 */