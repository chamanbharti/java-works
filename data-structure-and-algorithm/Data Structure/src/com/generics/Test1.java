package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Chaman");
		l.add("Bharti");
		//l.add(10);//Compile Time Error  
		//String s = (String) l.get(0);
		String s = l.get(0);
		System.out.println("element is:"+s);
		//int n = (int) l.get(1);
		//System.out.println(n);
		//System.out.println(l);
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
