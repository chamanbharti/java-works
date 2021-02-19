package com.netprophet;

import java.util.Scanner;
//http://www.codeforwin.in/2015/05/c-program-to-check-whether-triangle-side-is-valid-or-not.html
public class FindValidTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of triangle: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int valid = 0;
		
		if((a+b) > c){
			if((b+c) > a){
				if((a+c) > b){
					//if a+b>c,b+c>a and a+c>b then it is valid
					//System.out.println("Triangle is valid");
					valid = 1;
				}
				
			}
		}
		if(valid == 1){
			System.out.println("Triangle is valid");
		}else{
			System.out.println("Triangle is not valid");
		}
		
		//step 2
		/*int sum = a+b+c;
		if(sum == 180){
			System.out.println("Triangle is valid");
		}else{
			System.out.println("Triangle is not valid");
		}*/
	}

}
