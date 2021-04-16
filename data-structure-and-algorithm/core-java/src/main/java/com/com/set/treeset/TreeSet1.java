package com.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  al.add("10");
		 // al.add("");
		  System.out.println(al.add("Ajay"));//false
		  System.out.println(al);//[Ravi, Vijay, Ajay, null, 10]
		  
		  Iterator<String> itr=al.iterator(); 
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
