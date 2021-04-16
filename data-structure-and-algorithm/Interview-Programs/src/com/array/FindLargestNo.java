package com.array;

public class FindLargestNo {
	public static void main(String[] args) {
		
		int[] no = {1,2,3,4,5,5,60,7,7,8};
		//Arrays.sort(no); //you can sort given array
		
		int big = no[0];
		int index=0;
		for(int i =1;i<no.length;i++){
			if(big<no[i]){        //1st method
			//if(no[i] > big){     //2nd method
				big = no[i];
				index=i;
			}
			
		}
		System.out.println("Bigest No: "+big);
		System.out.println("Bigest Index: "+index);
	}

}
