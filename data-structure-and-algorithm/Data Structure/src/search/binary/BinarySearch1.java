package search.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		
		 int[] array = {10, 23, 15, 8, 4, 3, 25, 30, 34, 2, 19}; 
		 int item;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter no to search");
		 item = input.nextInt();
		 
		 int index = binarySearch(array,item);
		 if(index != -1) {
			 System.out.println(item+" found at index:array["+index+"]");
		 }else {
			 System.out.println(item+" element not found in array"+Arrays.toString(array));
		 }
		 
	}
	
	public static int binarySearch(int[] array,int item) {
		
        int left=0;
        int right=array.length-1;
        int mid;
        while(left<=right) {
        	mid = (left + right) / 2;
        	if(item == array[mid]) {
        		return mid;
        	}else if(item<array[mid]) {
        		right = mid - 1;
        	}else {
        		left = mid + 1;
        	}
        }
		return -1;//item doesn't exist in the array
	}
}
