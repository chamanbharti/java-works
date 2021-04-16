package com.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<>();
		al.add("chaman");
		al.add("Sahil");
		al.add("chaman");
		al.add("Sahil");
		al.add("Sahi");
		System.out.println("With duplicate:"+al);
		LinkedHashSet<String>hs1=new LinkedHashSet<>(al);
		ArrayList<String>al2=new ArrayList<>(hs1);
		al = al2;
		System.out.println("Without duplicate:"+al2);
		
		System.out.println(al2);
		
	}
}
