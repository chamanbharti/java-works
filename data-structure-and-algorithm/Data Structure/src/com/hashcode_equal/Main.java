package com.hashcode_equal;

import java.util.ArrayList;
import java.util.List;


public class Main{
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("123");
		list.add("1234");
		System.out.println(list);
		boolean contains123 = list.contains("123");
		System.out.println(contains123);
		boolean removed = list.remove("123");
		System.out.println(removed);
		System.out.println(list);
	}
	

}
