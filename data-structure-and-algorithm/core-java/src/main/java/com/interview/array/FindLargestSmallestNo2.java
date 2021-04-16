package com.array;

public class FindLargestSmallestNo2 {
	
	public static void main(String[] args) {
		int temp,n;
		int[] a = {2,3,4,1,6,7,8};
		n=a.length;
		
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);
	}

}
