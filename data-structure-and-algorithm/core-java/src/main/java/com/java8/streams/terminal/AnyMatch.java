package com.java8.streams.terminal;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		//Stream API helps to substitute for,for-each and while loops. It allows concentrating on operation's logic.
		//but not on the iteration over the sequence of elements. 
		//for example
		for(String str:list) {
			if(str.contains("B")) {
				System.out.println("True");
			}
		}
		//This code can be changed just with one line of java 8 code
		boolean isExist = list.stream().anyMatch(element->element.contains("B"));
		System.out.println(isExist);
		int a= 10;
		System.out.println(a>>1);
		System.out.println(a<<1);
	}
}
