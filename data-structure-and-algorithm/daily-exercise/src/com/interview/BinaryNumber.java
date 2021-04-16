package com.interview;

import java.util.Set;
import java.util.TreeSet;

public class BinaryNumber {
	public static void main(String[] args) {
		isBinary(128956);
		isBinary(101010);
	}
	static void isBinary(int number) {
		/*boolean isBinary = true;
		int copyOfNumber = number;
		while(copyOfNumber != 0) {
			int temp = copyOfNumber%10;
			if(temp>1) {
				isBinary=false;
				break;
			}else {
				copyOfNumber = copyOfNumber/10;
			}
		}
		if(isBinary) {
			System.out.println(number+" is Binary Number");
		}else {
			System.out.println(number+" is not Binary Number");
		}*/
		
		/*String s = Integer.toString(number);
		char[] strArray = s.toCharArray();
		Set set = new TreeSet();
		for(Character c:strArray) {
			set.add(c);
			set.remove('0');
			set.remove('1');
			
			
		}
		System.out.print(number+ " is ");
		//System.out.print(set.isEmpty()?":""not");
		if(set.isEmpty()) {
			System.out.println("a binary");
		}else {
			System.out.println(" is not a binary");
		}*/
		
		/*int remainder,count=0;
		while(number>0) {
			remainder = number%10;
			if(remainder !=0 && remainder !=1) {
				count++;
				break;
			}
			number = number/10;
			if(count == 1) {
				System.out.println("Number is not binary");
			}else {
				System.out.println("Number is binary");
			}
		}*/
		
		if(number>1) {
			int temp = number%10;
			if(temp == 0 || temp == 1) {
				System.out.println(number+" is binary");
			}else {
				System.out.println(number+" is not binary");
			}
		}
	}

}
