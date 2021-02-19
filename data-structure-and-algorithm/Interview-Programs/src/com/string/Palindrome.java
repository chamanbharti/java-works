package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome 
{
     public static void main(String[] args) throws IOException
     {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int len,length;
        String  reverse ="";
        System.out.println("Enter First String:");
        String str = bf.readLine(); 
        len=str.length();
        System.out.println("length of the string is:"+len);   
          for ( int i = len - 1 ; i >= 0 ; i-- )
             reverse = reverse + str.charAt(i);
              if (str.equals(reverse))
                 System.out.println("Entered string is a palindrome.");
              else
                 System.out.println("Entered string is not a palindrome.");
    }
}