package com.array;

import java.util.Scanner;

// Find the frequency of digits in an array
public class FindFrequencyOfDigitInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int frequency[] = new int[10];
		int arr[] = new int[10];
		int num=0;
		int rem=0;
		System.out.println("Enter the 10 element in array");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
			num = arr[i];
			while(num>0){
				rem = num%10;
				frequency[rem]++;
				//num = num/10;
				num/=10;
			}
		}
		for(int i=0;i<frequency.length;i++){
			if(frequency[i]!=0){
				System.out.println(i+" occured "+frequency[i]+" times");
			}
		}
	}

}
