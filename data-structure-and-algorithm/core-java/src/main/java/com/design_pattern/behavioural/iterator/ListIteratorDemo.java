package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import jdk.nashorn.internal.objects.IteratorResult;

public class ListIteratorDemo {
	public static void main(String args[]){  
		  //ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		LinkedList<String> list = new LinkedList<>();
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  
		  Iterator<String> it = list.descendingIterator();
		// Displaying list in reverse order
		     System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }
		  
		  //Traversing list through Iterator 
		  
//		  Iterator<String>itr = list.iterator();
//		  while(itr.hasNext()){
//			  System.out.println(itr.next());
//		  }
		  
		  
		//Traversing list through ListIterator 
//		  ListIterator<String>litr = list.listIterator();
//		  System.out.println("Traversing the list in forward direction:");
//	      while(litr.hasNext()){
//	       System.out.println(litr.next());
//	     }
//	     System.out.println("\nTraversing the list in backward direction:");
//	     while(litr.hasPrevious()){
//	       System.out.println(litr.previous());
//	    }
		
		// Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator itr = list.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
	      // Modify objects being iterated
	      ListIterator litr = list.listIterator();
	      
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
	}	
}
