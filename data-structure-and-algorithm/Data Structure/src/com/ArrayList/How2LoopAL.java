package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class How2LoopAL {
	public static void main(String[] args) {
		
	  ArrayList<Integer> arrlist = new ArrayList<Integer>();
      arrlist.add(14);
      arrlist.add(7);
      arrlist.add(39);
      arrlist.add(40);
      // 1 For Loop for iterating ArrayList
      System.out.println("For Loop: ");
      for(int counter=0;counter<arrlist.size();counter++){
    	  System.out.println(arrlist.get(counter));
      }
    // 2 While Loop for iterating ArrayList
      System.out.println("While Loop:");
      int i=0;
      while(arrlist.size() > i){
    	  System.out.println(arrlist.get(i));
    	  i++;
      }
      
      // 3 Do-While Loop for iterating ArrayList
      System.out.println("Do-While Loop: ");
      int j=0;
      do{
    	  System.out.println(arrlist.get(j));
    	  j++;
      }while(j<=3);
      
      // 4 Advance Loop for iterating ArrayList
      System.out.println("Advance Loop(for-each):");
      for(Integer num:arrlist){
    	 System.out.println(num); 
      }
      
      // 5 Iterator for iterating ArrayList
      System.out.println("Iterator:");
      Iterator<Integer> itr = arrlist.iterator();
      while(itr.hasNext()){
    	  System.out.println(itr.next());
      }
      
    // 6 ListIterator for iterating ArrayList
      System.out.println("ListIterator:");
      ListIterator<Integer> itr2 = arrlist.listIterator();
      while(itr2.hasNext()){
    	  System.out.println(itr2.next());
      }
      while(itr2.hasPrevious()) {
    	  System.out.println(itr2.previous());
      }
      
      // 7 Enumeration for iterating ArrayList
      System.out.println("Enumeration:");
      Enumeration<Integer> e = Collections.enumeration(arrlist);
      while(e.hasMoreElements()){
    	  System.out.println(e.nextElement());
      }
      
      
	}

}
