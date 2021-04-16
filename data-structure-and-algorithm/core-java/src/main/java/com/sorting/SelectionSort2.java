package sorting;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort2 {
	     
	    public static void main(String a[]){
	         
	        //int[] arr1 = {10,34,2,56,7,67,88,42};
	        int [] arr1={5,1,12,-5,16,2,12,14};
	        //int[] arr2 = doSelectionSort(arr1);
	        //Arrays.sort(arr1);
	        //Collections.sort(arr1);
	        for(int i:arr1){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	    
	   /* public static int[] doSelectionSort(int[] arr){
	         
	        for (int i = 0; i < arr.length-1; i++)
	        {
	            int min = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[min]) 
	                    min = j;
	      
	            int temp = arr[min];  
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }
	        return arr;
	    }*/
	
}