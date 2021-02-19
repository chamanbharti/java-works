package com.array;

public class FindSecondLargestNo1 {
	
	static int i;
	static int j;
	static int secondBig;
	static int size;
	public static void main(String[] args) {
		
		int[] no = {9,7,2,3,4,5,5,6,8,1};
		//Arrays.sort(no);
		//System.out.println(no);
		size = no.length;
		int big = no[0];
		int firstIndex=0;
		int secondIndex=0;
		for( i =1;i<no.length;i++){
			
			if(big<no[i]){
				big = no[i];
				
				j = i;
				firstIndex=i;
			}
			
		}
		System.out.println("First Bigest No: "+big);
		System.out.println("First Bigest Index: "+firstIndex);
		secondBig = no[size-j-1];
		for(i=1;i<no.length;i++){
			if(secondBig < no[i] && j!= i){
				secondBig = no[i];
				secondIndex=i;
			}
		}
		System.out.println("Second Bigest No: "+secondBig);
		System.out.println("Second Bigest Index: "+secondIndex);
	}

}
