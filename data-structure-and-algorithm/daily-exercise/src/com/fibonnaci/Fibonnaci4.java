package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci4 {
	public static void main(String[] args) {
		
		int first=0,second=1,next,i;
		int arr[] = new int[40];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no :");
		int n = input.nextInt();
		
		arr[0] = 0;
		arr[1] = 1;
		//0 1 3 8 21 55 144 377 0 1 3 8 21 55 144 377 
		// step 1
		for(i=2;i<n;i++){
					
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println("fibonacci series:");
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		/*// step 2
		do{
			
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
			n--;
		}while(n>0);*/
		
	}

}
