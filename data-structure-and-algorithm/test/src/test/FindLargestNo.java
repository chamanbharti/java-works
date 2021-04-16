package test;

import java.util.Arrays;

public class FindLargestNo {

	public static void main(String[] args) {
		//System.out.println("Hello World");
	//	int[] a = {1,2,3,4,5,2,7,4,3,9,33,23,65,29};
		int[] a = {4,3,7,1,5};
		
		sortArray(a);
		System.out.println(Arrays.toString(a));
		int no = find3rdLargetNo(a,3);
		System.out.println(no);
		
	}
	private static  int find3rdLargetNo(int[] a,int no){
	   return a[a.length - no]; 
	}
	private static void sortArray(int[] a){
		int n = a.length;
	    for(int j=0;j<n-1;j++){
	      //  for(int j=0;j<n-1;j++) {
	        	if(a[j] > a[j+1]){
	        		int temp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = temp;
	                j = -1;
		        }
	       // }
	    }
	}
	
	}
