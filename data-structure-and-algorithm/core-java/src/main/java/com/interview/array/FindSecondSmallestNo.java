package com.array;

public class FindSecondSmallestNo {
	
	static int i;
	static int j;
	static int firstSmall;
	static int secondSmall;
	static int size;
	public static void main(String[] args) {
		
		int[] no = {9,7,2,3,4,5,5,6,8,1};
		//Arrays.sort(no);
		size = no.length;
		firstSmall = no[0];
		
		for( i =1;i<size;i++){
			
			if(firstSmall > no[i]){
				
				firstSmall = no[i];
				
				j = i;
			}
			
		}
		System.out.println("First Small No: "+firstSmall);
		
		secondSmall = no[size-j-1];
		
		for(i=1;i<no.length;i++){
			
			if(secondSmall > no[i] && j!= i){
				secondSmall = no[i];
			}
		}
		System.out.println("Second Small No: "+secondSmall);
	}

}
