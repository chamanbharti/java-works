package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class PrintFirstElementFromCollection {

	public static void main(String[] args) {
		
		List<Integer>a =Arrays.asList(10,2,3,4,5);
		System.out.println("First Element:"+a.stream().findFirst().get());
//		Set<String> examples = new HashSet<>();
		List<String> examples = new ArrayList<>();
        examples.add("1");
        examples.add("2");
        examples.add("3");
        examples.add("4");
        examples.add("5");
        long startTime = new Date().getTime();
        System.out.println(examples.iterator().next());
        long endTime = new Date().getTime();
        long differnce = endTime - startTime;
        System.out.println("iterator - Elapsed time in milliseconds: " + differnce);
     
        startTime = new Date().getTime();
        System.out.println(examples.stream().findFirst().get());
        endTime = new Date().getTime();
        differnce = endTime - startTime;
        System.out.println("findFirst - Elapsed time in milliseconds: " + differnce);
        
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println(unsortMap);
        System.out.println(unsortMap.entrySet().iterator().next());
        System.out.println(unsortMap.entrySet().stream().findFirst().get());
	}

}
