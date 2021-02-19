package com.vector;

import java.util.Vector;

/*
  public class Vector<E>
   extends AbstractList<E>
   implements List<E>, RandomAccess, Cloneable, Serializable
1	
Vector()

This constructor is used to create an empty vector so that its internal data array has size 10 and its standard capacity increment is zero.

2	
Vector(Collection<? extends E> c)

This constructor is used to create a vector containing the elements of the specified collection, in the order they are returned by the collection's iterator.

3	
Vector(int initialCapacity)

This constructor is used to create an empty vector with the specified initial capacity and with its capacity increment equal to zero.

4	
Vector(int initialCapacity, int capacityIncrement)

This constructor is used to create an empty vector with the specified initial capacity and capacity increment.*/
public class VectorDemo {
	public static void main(String[] args) {
		//create an empty vector with an initial capacity of 4
		Vector<Integer> v = new Vector<Integer>(4);
		
		//use add() to add elements in the vector
		/*v.add(4);
		v.add(3);
		v.add(2);
		v.add(1);
		
		//let us print all the elements available in the vector
		System.out.println("Added numbers are:- "+v);
		for(Integer number:v){
			System.out.println("Number = "+number);
		}*/
		 // use add() method to add elements in the vector
		   v.add(0,4);
		   v.add(1,3);
		   v.add(2,2);
		   v.add(3,1);
		// let us print all the elements available in vector
		   System.out.println("Added numbers are :- "); 
		   for (Integer number : v) {         
			   System.out.println("Index :"+v.indexOf(number) +" Number: " + number);
		   }
		   v.add(3,10);
		      
		   // let us print all the elements available in vector after insertion
		   System.out.println("Added numbers after insertion are :- "); 
		   for (Integer number : v) {         
		   System.out.println("Index :"+v.indexOf(number) +" Number: " + number);
		   }
	}

}
