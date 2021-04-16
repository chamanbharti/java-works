package com.interview;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		
		int[] a = {10,20,20,30,30,40,50,50}; 
		int length = a.length-1;
		System.out.println("Original Element");
		for(int i=0;i<length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//print duplicate 
		printDuplicate(a,length);
		removeDuplicateElement(a,length);
        
	}
	
	public static void printDuplicate(int[] a,int n) {
		System.out.println("Duplicate Element");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i] == a[j])
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.println();
	}
	public static void removeDuplicateElement(int[] a,int n) {
		
		if(n == 0 || n == 1) {
			//return n;
			System.out.println(n);
		}
		
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i] != a[i+1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n-1];
		//changing original array
		for(int i=0;i<j;i++) {
			a[i] = temp[i];
		}
		System.out.println("Unique Element");
		for(int i=0;i<n;i++) {
			System.out.print(temp[i]+" ");
		}
		//return j;
		
		//2nd method
		/*System.out.println("Unique Element");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;) {
				if(a[j] == a[i]) {
					for(int k=j;k<n;k++) {
						a[k] = a[k+1];
					}
					n--;
				}else {
					j++;
				}
				
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}*/
		
	}

}
