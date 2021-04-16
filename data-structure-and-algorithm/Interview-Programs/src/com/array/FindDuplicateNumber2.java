package com.array;

import java.util.Arrays;

public class FindDuplicateNumber2 {
	
	public static void main(String[] args) {
		
		int[] no = {1,2,3,4,5,6,8,9,11};
		int[] a = {1,2,3,4,5,5,6,8,9,11,12,12};
		
		//findDuplicate(a);
		findMissing(no);
		
	}

	/*private static void findDuplicate(int[] a) {
		System.out.println(Arrays.toString(a));
		for(int i =1;i<a.length;i++){
			if(a[i] == a[i+1])
				System.out.println("Duplicate: "+a[i]);
		}
		
	}
*/	
	private static void findMissing(int[] no) {


		System.out.println(Arrays.toString(no));
		int pVal=no[0];
		for(int i =1;i<no.length;i++){
			pVal=no[i-1];
			int cVal=no[i];
			if(i>1){
				if(cVal!=pVal+1)
					System.out.println("Missing: "+(no[i]-1));
			
		}
		
	}
		
	}

}
