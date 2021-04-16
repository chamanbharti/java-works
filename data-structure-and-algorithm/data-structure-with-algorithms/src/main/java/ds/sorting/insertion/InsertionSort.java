package ds.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {8,4,1,5,9,2};
		approach2(a);
		System.out.println("Sorted:"+Arrays.toString(a));
	}

	private static void approach1(int[] a) {
		int n = a.length;
		int step = 0;
		for(int i=1;i<n;i++) {
		
			System.out.print("Step:"+(++step)+" ");
	        System.out.println(Arrays.toString(a) );
	        
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		
	}
	
	private static void approach2(int[] a) {
		int n = a.length;
		int step = 0;
		for(int i=1;i<n;i++) {
		
			System.out.print("Step:"+(++step)+" ");
	        System.out.println(Arrays.toString(a) );
	        
			int temp = a[i];
			int j = i;
			while(j > 0 && temp < a[j-1]) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		
	}
}
