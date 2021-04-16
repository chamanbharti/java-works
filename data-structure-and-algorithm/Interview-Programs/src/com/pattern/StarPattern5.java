package com.pattern;
/*
   *   
    *  
     * 
*******
     * 
    *  
   *   

 */
public class StarPattern5 {
	
	public static void main(String[] args) {//main method/main thread
	
		int n=7;//size(odd)
		int c1=(n-1)/2;//cond
		int c2=3*n/2-1;//cond
		for(int i=0;i<n;i++){//outer loop for row
			
			for(int j=0;j<n;j++){//inner loop for column to print space
				if(j-i==c1 || i+j == c2 || i==c1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
				System.out.println("");
		}
	}
}
