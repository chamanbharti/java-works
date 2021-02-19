package com.array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber4 {
	//http://www.cquestions.com/2008/01/write-c-program-to-find-largest-number.html
	//http://javaconceptoftheday.com/java-array-interview-questions-and-answers/
	//http://javaconceptoftheday.com/array-to-arraylist-in-java-with-examples/
	public static void main(String[] args) {
		System.out.println("Find duplicate number in array");
		int [] a = {1, 2, 3, 3, 4, 5, 6};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		FindDuplicateNumber4 d = new FindDuplicateNumber4();
		System.out.println("\nDuplicate No: "+d.findDuplicateNo(a));
	}

	private int findDuplicateNo(int[] a) {

		int highest_No = a.length-1;
		int total = getSum(a);
		int duplicateNo = total - (highest_No * (highest_No +1) /2 );
		return duplicateNo;
	}

	private int getSum(int[] a) {

		int sum = 0;
		for(int num:a){
			sum = sum + num;
		}
		return sum;
	}

}
