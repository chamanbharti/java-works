package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import jdk.nashorn.internal.objects.IteratorResult;

public class ListIteratorDemo1 {
	public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		
		// Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator<String> itr = list.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
	      // Modify objects being iterated
	      ListIterator<String> litr = list.listIterator();
	      
	     // Modify objects being iterated
	     // set method
	     while(litr.hasNext()) {
	    	 Object element = litr.next();
	    	 litr.set(element+" +");
	     }
	     
	     System.out.print("Modified contents of al: ");
	      itr = list.iterator();
	      while(itr.hasNext()) {
	          Object element = itr.next();
	          System.out.print(element + " ");
	       }
	       System.out.println();
	       
	    // Now, display the list backwards
	       System.out.print("Modified list backwards: ");
	       
	       while(litr.hasPrevious()) {
	          Object element = litr.previous();
	          System.out.print(element + " ");
	       }
	       System.out.println();
	}	
}
