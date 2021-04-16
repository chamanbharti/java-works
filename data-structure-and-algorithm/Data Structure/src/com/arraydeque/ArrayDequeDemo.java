package com.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
 * Class declaration
Following is the declaration for java.util.ArrayDeque class:

public class ArrayDeque<E>
   extends AbstractCollection<E>
   implements Deque<E>, Cloneable, Serializable
Here <E> represents an Element, which could be any class. For example, if you're building an array list of Integers then you'd initialize it as:

ArrayList<Integer> list = new ArrayList<Integer>();  
Class constructors
S.N.	Constructor & Description
1. ArrayDeque()
This constructor is used to create an empty array deque with an initial capacity sufficient to hold 16 elements.
2. ArrayDeque(Collection<? extends E> c)
This constructor is used to create a deque containing the elements of the specified collection.
3. ArrayDeque(int numElements)
This constructor is used to create an empty array deque with an initial capacity sufficient to hold the specified number of elements.
Total Methods are 31 in ArrayDeque
 */
public class ArrayDequeDemo {
	public static void main(String[] args) {
		
		//create an empty array deque with an intial capacity
		Deque<Integer> deque = new ArrayDeque<>(5);
		//use add() method to elements in the deque
		deque.add(25);
		deque.add(30);
		deque.add(35);
		
	  // use addFirst() method to add element at the front of the deque
	   deque.addFirst(10);
	   deque.addFirst(15);
	   deque.addFirst(20);//now, element 20 will be at the front
	
	// these elments will be added in continuation with deque.add(35)
	  deque.add(45);
	  deque.add(40);
	  
	  // the values will be printed in the same order
	  deque.addLast(10);
	  deque.addLast(12);
	  for(int i=1;i<10;i++) {
		  deque.add(i);
	  }
	  //let us print all the elements available in deque
		for(Integer number : deque){
			
			System.out.println("Number = "+number);
			//deque.add(55);
		}
				
		//finding the size of this deque
		int retval = deque.size();
		System.out.println("Deque consists of "+retval+" elements");
		
		System.out.println("Performing clear operation!!");
		deque.clear();
		retval = deque.size();
		System.out.println("Now, deque consists of "+retval+" elements");
		
		// create an empty array deque with an initial capacity
		   ArrayDeque<Integer> deque1 = new ArrayDeque<Integer>(8);

		   // use add() method to add elements in the deque
		   deque1.add(15);
		   deque1.add(30);
		   deque1.add(20);
		   deque1.add(18);
		      
		   // clone the first deque,
		   Deque<Integer> deque2 = deque1.clone();
		           
		   // let us print all the elements available in deque2
		   // now deque2 should have similar elements to deque1.
		   for (Integer number : deque2) {
		   System.out.println("Number = " + number);
		   }
		   
		   
		
	}

}
