package com.array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber1 {
	//http://www.cquestions.com/2008/01/write-c-program-to-find-largest-number.html
	//http://javaconceptoftheday.com/java-array-interview-questions-and-answers/
	//http://javaconceptoftheday.com/array-to-arraylist-in-java-with-examples/
	public static void main(String[] args) {
		System.out.println("Find duplicate number in array");
		List<Integer> no = new ArrayList<Integer>();
		
		for(int i=1;i<30;i++){
			no.add(i);
		}
		System.out.println(no);
		//Add duplicate no into List
		no.add(11);
		System.out.println(no);
		
		FindDuplicateNumber1 d = new FindDuplicateNumber1();
		System.out.println("Duplicate No: "+d.findDuplicateNo(no));
	}

	private int findDuplicateNo(List<Integer> no) {

		int highest_No = no.size() -1;
		int total = getSum(no);
		int duplicateNo = total - (highest_No * (highest_No +1) /2 );
		return duplicateNo;
	}

	private int getSum(List<Integer> no) {

		int sum = 0;
		for(int num:no){
			sum = sum + num;
		}
		return sum;
	}

}
