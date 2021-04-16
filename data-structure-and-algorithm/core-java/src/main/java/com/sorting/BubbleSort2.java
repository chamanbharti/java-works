package sorting;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		int [] arr1={10,34,256,7,67,88,42};
		int [] arr2=doBubbleSort(arr1);
		
		//You can also use sort method of Arrays class to sort integers in ascending order 
		//but remember that sort method uses a variation of Quick sort algorithm.
		//Arrays.sort(arr1);
		for(int i:arr1){
			System.out.print(i+" ");
			//System.out.print(" , ");
		}
		
		
	}

	public static int[] doBubbleSort(int[] input) {
		 int temp;
		 for(int i=0;i<input.length-1;i++){
			 for(int j=0;j<input.length-i-1;j++){
				 if(input[j]>input[j+1]){//ascending order
				// if(input[j]<input[j+1]){//descending order
					 temp=input[j];
					 input[j]=input[j+1];
					 input[j+1]=temp;
				 }
			 }
		 }
		 return input;
	}
}
