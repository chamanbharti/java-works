package com.set.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortedSet1 {
	public static void main(String[] args) {
		SortedSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  //al.add(null);
		  al.add("10");
		 // al.add("");
		  System.out.println(al.add("Ajay"));//false
		  System.out.println(al);//[Ravi, Vijay, Ajay, null, 10]
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){ 
			  Object o=itr.next();
		   //System.out.println(itr.next());
			  System.out.println(o);  
		  }  
		  //String[] array = (String[]) al.toArray(new String[al.size()]);
	}

}
