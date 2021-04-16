package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test0 {
	public static void main(String[] args) {
		Collection l = new ArrayList();
		//List l = new ArrayList();
		l.add("Chaman");
		l.add(10);
		//String s = (String) l.get(0);
		//System.out.println(s);
		//int n = (int) l.get(1);
		//System.out.println(n);
		System.out.println(l);
	}

}
