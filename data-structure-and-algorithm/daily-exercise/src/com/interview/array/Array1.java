package com.interview.array;

public class Array1 {

	
	public static void main(String[] args) {
		
		/*int numbers[]=new int[20];
		numbers[0]=0;
		numbers[1]=1;
		numbers[2]=2;
		numbers[3]=3;
		numbers[4]=4;
		numbers[5]=5;
		numbers[6]=6;
		numbers[7]=7;
		numbers[8]=8;
		numbers[9]=9;
		
		for(int i=0;i<numbers.length;i++){
	        System.out.print(numbers[i]+" ");
	    }
		
		System.out.println("\nnumbers size:"+numbers.length);//10
		
		//numbers[10]=11;//AIOOBE
		//System.out.println("\nnumbers size:"+numbers.length);//10
		System.out.println("Inserting an element in the first position");
		for(int i=numbers.length;i>=0;i--) {
			numbers[i] = numbers[i-10];
		}
		numbers[19]=11;*/
		
		   int LA[] = {1,3,5,7,8};
		   int item = 10, k = 3, n = 5;
		   int i = 0, j = n;
		   
		   System.out.println("The original array elements are :\n");

		   for(i = 0; i<n; i++) {
			   System.out.print("LA["+i+"] = \n"+LA[i]);
		   }

		   n = n + 1;
			
		   while( j >= k) {
		      LA[j+1] = LA[j];
		      j = j - 1;
		   }

		   LA[k] = item;

		   System.out.println("The array elements after insertion :\n");

		   for(i = 0; i<n; i++) {
			   System.out.println("LA["+i+"] = "+"\n"+LA[i]);
		   }
		
	}
		
}
//https://www.tutorialspoint.com/data_structures_algorithms/array_data_structure.htm
