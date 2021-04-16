package com.interview.math.even_odd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNoUsingJava8 {

public static void main(String[] args) {
		
//		List<Integer>list = new ArrayList<>();
//		list.add(1);
//		list.add(1);
//		list.add(2);
//		List<Integer>list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(list2);
		
		List<String>list = new ArrayList<>();
		list.add("1");
		list.add("1");
		list.add("2");
//		for(String s:list) {
//		int i = Integer.valueOf(s);
//		if(i%2==0) {
//			list2.add(s);
//		}
//	}
//		List<String>list2 = list.stream().filter(i->Integer.valueOf(i)%2==0).collect(Collectors.toList());
		List<String>list2 = list.stream().filter(i->(Integer.valueOf(i))%2 !=0).collect(Collectors.toList());;
		//System.out.println(list2);
		
		
	}
}
