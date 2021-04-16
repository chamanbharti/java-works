package com.java8.flat_map_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		
		 // Creating a list of Odd Numbers 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
        
        //approach I
        List<List<Integer>>mergeList = Arrays.asList(OddNumbers,EvenNumbers);
        List<Integer> finalList3 = mergeList.stream().flatMap(list->list.stream()).sorted((a,b)->(a-b)).collect(Collectors.toList());
		System.out.println(finalList3);
		
		//approach II
		Stream<Integer>list1 = Arrays.asList(1, 3, 5).stream();
		Stream<Integer>list2 = Arrays.asList(2, 4, 6, 8).stream();
		Stream<Integer>list3 = Stream.concat(list1, list2);
		finalList3 = list3.sorted((a,b)->(b-a)).collect(Collectors.toList());
		System.out.println(finalList3);
	}
}
