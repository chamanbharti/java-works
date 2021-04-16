package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci5 {
	public static void main(String[] args) {
		
		int first=0,second=1,next,i=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no :");
		int n = input.nextInt();
		
		/*for(i=0;i<n;i++){
			System.out.print(Fibonnaci(i)+" ");
			
		}
		
	}

	static int Fibonnaci(int n) {
		
		 if(n == 0){
			 return 0; 
		 }
			
		 else if(n == 1){
			 return 1;
		 }
			
		 else {
			 return (Fibonnaci(n-2) + Fibonnaci(n-1));
		 }
		 
			 
	}*/
		for(i=0;i<n;i++){
			System.out.print(Fibonnaci(i)+" ");
		}
		
	}

	static int Fibonnaci(int n) {
		
		 if(n<2)
			 return n; 	
		 else 
			 return (Fibonnaci(n-1) + Fibonnaci(n-2));	 
	}

	
	

}
