package com.string;

import java.io.*;
public class UpperToLowerCase1 
{
     public static void main(String args[]) throws IOException
     {
        BufferedReader buff =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String s = buff.readLine();
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("UPPER STRING:"+upper);
        System.out.println("LOWER STRING:"+lower);
     }
}
