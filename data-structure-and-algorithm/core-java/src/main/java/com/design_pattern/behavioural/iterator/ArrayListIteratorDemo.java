package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ArrayListIteratorDemo {
	public static void main(String args[]){  
		  //ArrayList<String> list=new ArrayList<String>(); 
		  //List<String> list=new LinkedList<String>();
		  //Vector<String> list = new Vector<>();
		  List<String> list = new Stack<>();
		  list.add("Ravi");
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  
		  System.out.print("\n1 for loop : \n");
		  for(int i=0;i<list.size();i++) {
			  System.out.println(list.get(i));
		  }
		  
		  System.out.print("\n2 Advance for loop (for each loop) : \n");
		  for(String s:list) {
			  System.out.println(s);
		  }
		  

		  System.out.print("\n3 while loop : \n");
		  int i=0;
		  while(list.size() > i) {
			  System.out.println(list.get(i));
			  i++;
		  }
		  
		  System.out.print("\n4 do..while loop : \n");
		  int j=0;
		  do {
			  System.out.println(list.get(j));
			  j++;
		  }while(list.size() > j );
		  
		  System.out.print("\n5 Iterator : \n");
		  Iterator<String>itr = list.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  
		  System.out.print("\n6 ListIterator I: \n");
		  ListIterator<String>itr2 = list.listIterator();
		  while(itr2.hasNext()) {
			  System.out.println(itr2.next());
		  }
		  
		  System.out.print("\n6 ListIterator II: \n");
		  for(ListIterator<String>itr3 = list.listIterator();itr3.hasNext();) {
			  System.out.println(itr3.next());
		  }
		  
		  System.out.print("\n7 Enumeration: \n");
		  Enumeration<String>enumeration = Collections.enumeration(list);
		  while(enumeration.hasMoreElements()) {
			  System.out.println(enumeration.nextElement());
		  }
		  
		  System.out.print("\n8 forEach: \n");
		  list.forEach(System.out::println);
		  
		  System.out.print("\n9 Stream : \n");

		  list.stream().forEach(System.out::println);
		  
	}	
}
