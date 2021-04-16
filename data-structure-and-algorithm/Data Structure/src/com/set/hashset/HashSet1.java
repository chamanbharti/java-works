package com.set.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  al.add("10");
		 // al.add(null);
		  //al.add(null);
		 // al.add("");
		 // System.out.println(al.add("Ajay"));//false
		  System.out.println(al);
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
