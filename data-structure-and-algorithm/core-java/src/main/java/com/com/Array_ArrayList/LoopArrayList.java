package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class LoopArrayList {
	public static void main(String[] args) {
		 ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);

	      /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop");
	      for(Integer num : arrlist){
	    	  System.out.println(num);
	      }
	      /* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 
	      int count = 0;
	      while(arrlist.size() > count){
	    	  System.out.println(arrlist.get(count));
	    	  count++;
	      }
	      /*Looping Array List using Iterator*/
	      System.out.println("Iterator");
	      Iterator<Integer> itr = arrlist.iterator();
	      while(itr.hasNext()){
	    	  System.out.println(itr.next());
	      }
	   // Get the Enumeration object
	      Enumeration<Integer> e = Collections.enumeration(arrlist);
	      // Enumerate through the ArrayList elements
	      System.out.println("Enumeration: ");
	      while(e.hasMoreElements()){
	    	  System.out.println(e.nextElement());
	      }
	}

}
