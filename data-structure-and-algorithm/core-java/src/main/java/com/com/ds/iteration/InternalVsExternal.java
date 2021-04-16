package com.ds.iteration;

import java.util.Arrays;
import java.util.List;

public class InternalVsExternal {
	public static void main(String[] args) {
		/**
		 There are two types of iterators: external and internal. An external iterator is active, 
		 an internal is passive.

		When the client (i.e. the programmer) controls the iteration, the iterator is called external iterator. 
		When the iterator controls it, it is called an internal iterator.
		
		Generally, it is recommended to use internal iterator over external iterator. 
		Internal iteration is less error prone, more readable, and requires less code. 
		On the other hand, external iterator is sometimes more flexible; for instance, 
		when doing an operation for two collections in a loop.
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		//external iteration
//		int sum = 0;
//	    for (int n : numbers) {
//	      if (n % 2 == 1) {
//	        int square = n * n;
//	        sum = sum + square;
//	      }
//	    }
//	    System.out.println(sum);
	    
		 //internal iteration
		    int sum = numbers.stream()
		        .filter(n -> n % 2  == 1)
		        .map(n  -> n * n)
		        .reduce(0, Integer::sum);

		    System.out.println(sum);
		    System.out.println(numbers);
		
	}

}
