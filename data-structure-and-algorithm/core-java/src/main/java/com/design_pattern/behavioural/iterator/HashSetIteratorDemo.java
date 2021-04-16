package design_pattern.behavioural.iterator;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetIteratorDemo {
	public static void main(String args[]){  
		 // Set<String> set=new HashSet<>(); 
		  Set<String> set=new LinkedHashSet<>();
		  set.add("Ravi");
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  
		  System.out.print("\n1 Advance for loop (for each loop) : \n");
		  for(String s:set) {
			  System.out.println(s);
		  }
		  

		  System.out.print("\n2 Iterator : \n");
		  Iterator<String> itr = set.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  
	  
		  System.out.print("\n3 Enumeration: \n");
		  Enumeration<String>enumeration = Collections.enumeration(set);
		  while(enumeration.hasMoreElements()) {
			  System.out.println(enumeration.nextElement());
		  }
		  
		  System.out.print("\n4 forEach: \n");
		  set.forEach(System.out::println);
		  
		  System.out.print("\n5 Stream : \n");

		  set.stream().forEach(System.out::println);
		  
	}	
}
