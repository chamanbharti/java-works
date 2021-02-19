package com.string;

public class PalindromeNumber 
{
     static void palindrom(int num)
     {
        int newNum=0,remainder,temp;
        temp = num;
        //find sum of all digits of the number
        while(temp != 0){
        	remainder = temp % 10;
        	newNum 	  = newNum * 10 + remainder;
        	temp   	  = temp/10;
        }
      //Check if sum of all digit's of the number //is equal to the given number or not. 
    	if(newNum == num){
    		System.out.println(num +" is palindrome."); 
    		}
    	else{ 
    		System.out.println(num +" is not palindrome."); 
    		} 
     }
     public static void main(String[] args) {
		//method call
    	 palindrom(12321);
	}
}
       