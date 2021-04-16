package ds.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
//		int[] a = {1,7,3,9,23,77,33,99,30};
//		int[] a = {1,2,3,4,5,2,7,4,3,9,33,23,65,29};
		int[] a = {4,3,7,1,5};
		modifiedBubbleSortApproach4_3(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void bubbleSortApproachUsingSingleLoop(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				i = -1;
			}
		}
	}

	private static void bubbleSortApproach1(int[] a) {
		int n = a.length;
		for(int i= 0;i < n - 1;i++) {
			for(int j = 0;j < n - 1;j++) {
				if(a[j] > a[j+1]) { // ascending order
//				if(a[j] < a[j+1]) { // descending order
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	private static void bubbleSortApproach2(int[] a) {
		int n = a.length;
		for(int i= 0;i < n - 1;i++) {
			for(int j = 0;j < n - 1;j++) {
//			    if(a[j+1] < a[j]) { // ascending order
				if(a[j+1] > a[j]) { //descending order
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	private static void bubbleSortApproach3(int[] a) {
		int n = a.length;
		for(int i= 0;i < n - 1;i++) {
			for(int j = 0;j < n - i - 1;j++) {
			    if(a[j+1] < a[j]) { // ascending order
//				if(a[j+1] > a[j]) { //descending order
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	//this method is useful when your array is already sorted
	// this modified version improves the best case of bubble sort to O(n)
	private static void modifiedBubbleSortApproach4_1(int[] a) {
		int n = a.length;
		for(int i= 0;i < n - 1;i++) {
			int swaped = 0;
			
			for(int j = 0;j < n - i - 1;j++) {
			    if(a[j] > a[j+1]) { // ascending order
//				if(a[i] < a[j+1]) { //descending order
			    	int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swaped = 1;
				}
			}
			if(swaped==0) {
				break;
			}
		}
	}
	
	// this modified version improves the best case of bubble sort to O(n)
	private static void modifiedBubbleSortApproach4_2(int[] a) {
		int n = a.length;
		for(int i= 0;i < n - 1;i++) {
			int swaped = 1;
			
			if(swaped==0) {
				return;
			}
			
			for(int j = 0;j < n - i - 1;j++) {
			    if(a[j] > a[j+1]) { // ascending order
//				if(a[i] < a[j+1]) { //descending order
			    	int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swaped = 1;
				}
			}
			
		}
	}
	
	// this modified version improves the best case of bubble sort to O(n)
		private static void modifiedBubbleSortApproach4_3(int[] a) {
			int n = a.length;
			boolean done = false;
			while(!done) {
				done = true;
				for(int i = 0;i < n -1;i++) {
				    if(a[i] > a[i+1]) { // ascending order
//					if(a[i] < a[j+1]) { //descending order
				    	int temp = a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
						done = false;
					}
				}
				n--;
			}
		}
		
		// We can shorted the number of items check in each iteration by one
		// Slightly improved version of the bubble sort:
		private static void modifiedBubbleSortApproach4_4(int[] a) {
			int n = a.length;// n = last item to be checked, Check all items
			boolean done = false;
			while(!done) {
				 System.out.print("Step " + (a.length-n) + ": ");
		         System.out.println(Arrays.toString(a) );
				done = true;// Set tripwire
				for(int i = 0;i < n -1;i++) {
				    if(a[i] > a[i+1]) { // ascending order
//					if(a[i] < a[j+1]) { //descending order
				    	int temp = a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
						done = false;// tripwire activated !
					}
				}
				n--;       // Shorten the number of pairs checked.
			}
		}
		
		// using comparable
}
