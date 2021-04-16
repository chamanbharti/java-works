package com.perfectnumber;
public class PerfectNumber5 {
	static int n,i,sum = 0;
	public static void main(String[] args) {
		//int n,i,sum = 0;
		
		 System.out.println("Perfect numbers are: ");
		for(n=1;n<=100;n++){
			i=1;
			sum=0;
			while(i<n){
				if(n%i == 0){
					sum = sum + i;
					i++;
				}
				  
			}
			if(sum==n)
				 System.out.printf("%d ",n);
		}
		
		
		
	}
}
