package design_pattern.behavioural.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class IteratorMethodsDemo {
	public static void main(String args[]){  
		  
	   //before java 8
		//So in this code, I need to use a while loop in order to use the iterator to iterate through the input list.
		
/*		
       List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
	    Iterator<Integer> itr = input.iterator();
	    while(itr.hasNext())
	      System.out.println(itr.next());
*/
		
/**
 Java 8 has added a method called forEachRemaning to the Iterator interface. 
 This helps in using an Iterator to internally iterate over a Collection, without an explicit loop. 
 I will be covering the forEachRemaining Java 8 method  
 Using Java 8 forEachRemaining
Java 8 added the forEachRemanining method to the Iterator interface. So using this method, 
the above code can be re-written as follows:
 */
	    
				
	       List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		   Iterator<Integer> itr = input.iterator();
		   //itr.forEachRemaining(num -> System.out.println(num));
		   itr.forEachRemaining(System.out::println);
	 
/**
 forEachRemaning Explained
So basically, when I use the forEachRemaining method, you no longer require a while loop in order to iterate through the input list via an Iterator. 
The forEachRemaining method accepts as a parameter a Consumer instance. The above code implements this via a lambda expression, 
that simply prints the number. 
The forEachRemaining method does not provide any other benefit other than eliminating the need to write a while loop.
The forEachRemaining is a new method in the Iterator interface and helps to iterate through a Collection without an explicit loop when an Iterator is used.
 */
		   //for it for more details
//https://www.javatpoint.com/java-iterator
//https://www.baeldung.com/java-iterator
//https://javabeginnerstutorial.com/core-java-tutorial/java-collection-iterators/		   
//https://www.programcreek.com/java-api-examples/?class=java.util.Iterator&method=forEachRemaining
	}
}
