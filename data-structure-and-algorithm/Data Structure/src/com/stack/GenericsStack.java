package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class GenericsStack {
	 public static void main(String args[])
	  {                             // 1.  Stack that stores only int values
	    Stack<Integer> st1 = new Stack<Integer>();          // generics int stack
	    st1.add(10);
	    st1.add(20);
	    st1.add(30);
	    st1.add(40);
	    System.out.print("Printing int stack: ");
	    for(int k : st1)
	    {
	      System.out.print(k + " ");
	    }
	                               // 2.  Stack that stores only strings
	    Stack<String> st2 = new Stack<String>();           // generics string stack
	    st2.add("Believe");
	    st2.add("atleast");
	    st2.add("one");
	    System.out.print("\nPrinting string stack: ");
	    for(String k : st2)
	    {
	      System.out.print(k + " ");
	    }
	                               // 3.  Stack that stores only chars
	    Stack<Character> st3 = new Stack<Character>();     // generics char stack   
	    st3.add('A');
	    st3.add('B');
	    st3.add('C');
	    System.out.print("\nPrinting char stack: ");
	    for(char k : st3)
	    {
	      System.out.print(k + " ");
	    }
	                               // 4.  Stack that stores only double
	    Stack<Double> st4 = new Stack<Double>(); // generics double stack
	    st4.add(10.5);
	    st4.add(20.5);
	    st4.add(30.5);
	    System.out.print("\nPrinting double stack: ");
	    for(double k : st4)
	    {
	      System.out.print(k + " ");
	    }
		                                     // printing with iterator
	   System.out.print("\nUsing Iterator: ");
	   Iterator it1 = st2.iterator();
	   while(it1.hasNext())
	   {
	       System.out.print(it1.next() + " ");
	   }
	  }

}
