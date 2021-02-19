package com.array;

public class FindSecondSmallestNo2 {
	
	public static void main(String[] args) 
	{
		 int[] a = {5, 4, 10, 100, 10, 30, 3};
		    int smallest = a[0];
		    int secondSmallest = a[0];
		    for (int i = 0; i < a.length; i++) 
		    {
		        if(a[i]==smallest)
		        {
		          secondSmallest=smallest;
		        } 
		        else if (a[i] < smallest) 
		        {
		            secondSmallest = smallest;
		            smallest = a[i];
		        } 
		        else if (a[i] < secondSmallest) 
		        {
		            secondSmallest = a[i];
		        }

		    }
		    System.out.println("first smallest:"+smallest);
		    System.out.println("second smallest:"+secondSmallest);
	}

}
