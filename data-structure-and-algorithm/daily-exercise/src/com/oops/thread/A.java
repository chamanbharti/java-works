package com.oops.thread;


public class A {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int next;
		//System.out.print(a+" "+b+" ");
		int arr[] = new int[10];
		arr[0]=0;
		arr[1]=1;
		/*for(int i=2;i<5;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}*/
		/*for(int i=0;i<5;i++) {
			System.out.println(arr[i] );
		}*/
		for(int i=0;i<5;i++){
			System.out.print(Fibonnaci(i)+" ");
		}
		
	}

	/*static int Fibonnaci(int n) {
		
		 if(n<2)
			 return n; 	
		 else 
			 return (Fibonnaci(n-1) + Fibonnaci(n-2));	 
	}*/
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
		 
			 
	}


	
}

