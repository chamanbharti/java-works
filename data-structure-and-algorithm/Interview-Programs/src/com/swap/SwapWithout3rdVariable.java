package com.swap;

public class SwapWithout3rdVariable {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("Before swapping: a="+a+" and b="+b);
		/*//method 1
		a = a+b;//15
		b = a-b;//10
		a = a-b;//5
		*/	
		// method 2
		//a = a+b-(b=a);
		b = a+b-(a=b);
		
		//method 3
		/*a = a^b;
		b = a^b;
		a = b^a;*/
		
		//method 4
		/*a = b-~a-1;
		b = a+~b+1;
		a = a+~b+1;*/
		
		//method 5
		/*a = a*b;
		b = a/b;
		a = a/b;*/
		System.out.println("After swapping:  a="+a+" and b="+b);
		swapNumbers(a,b);

	}

	static void swapNumbers(int num1, int num2){
		num1 = num1 + num2; 
		num2 = num1 - num2; 
		num1 = num1 - num2;
		System.out.println("After swapping: "+ num1 + " and " + num2); 
	}
}
//http://www.cquestions.com/2008/01/write-c-program-for-swap-two-variables.html