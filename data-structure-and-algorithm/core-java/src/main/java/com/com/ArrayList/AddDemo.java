package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * Class declaration
Following is the declaration for java.util.ArrayList class:
public class ArrayList<E>
   extends AbstractList<E>
   implements List<E>, RandomAccess, Cloneable, Serializable
Here <E> represents an Element. For example, if you're building an array list of Integers then you'd initialize it as
ArrayList<Integer> list = new ArrayList<Integer>();  
Class constructors
S.N.	Constructor & Description
1. ArrayList()
This constructor is used to create an empty list with an initial capacity sufficient to hold 10 elements.
2. ArrayList(Collection<? extends E> c)
This constructor is used to create a list containing the elements of the specified collection.
3. ArrayList(int initialCapacity)
This constructor is used to create an empty list with an initial capacity.
Total methods are 20 in ArrayList
 */

public class AddDemo {
	public static void main(String[] args) {
	      
		   // create an empty array list with an initial capacity
		   ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

		   // use add() method to add elements in the list
		   arrlist.add(15);
		   arrlist.add(20);
		   arrlist.add(25);
		   arrlist.add(28);
		   arrlist.add(30);
		   arrlist.add(250);
		   // let us print all the elements available in list
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   //arrlist.add(30);
		   }
		   Iterator<Integer> itr = arrlist.iterator();
		   while(itr.hasNext()){
			   //Object o = itr.next();
			   //arrlist.remove(0);
			   //itr.remove();
			  // System.out.println(o);
			   itr.remove();
			   System.out.println(itr.next());
			  
		   }
		   
	}
}
