package com.sumOfEnteredNo;

public class Print1To100WithoutLoop {
	public static void main(String[] args) {
		
		int num = 1;
		print(num);
	}

	private static void print(int num) {
		if(num<=100)
			System.out.println(num);
		print(num+1);
		
	}

}
