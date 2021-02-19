package sorting;

import java.util.Arrays;

public class BubbleSort3 {

	public static void main(String[] args) {
		int a[]= {7,10,34,42,67,88,256};
		System.out.println("Primative Arrays before sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Primative Arrays after Sorting");
		System.out.println(Arrays.toString(a));
		
	}
}
