package com.stack;

import java.util.Date;
import java.util.Stack;

public class GeneralStack {
	public static void main(String args[])
	  {
	    Stack st = new Stack();
	    System.out.println("Calling empty() before elements are added: " + st.empty());
	    st.push(10);
	    st.push(20);
	    st.add(30);
	    st.push("SNRao");
	    st.add(20.5);
	    st.add(new Date());
	    st.push(true);
	    st.push('A');
	    st.push(50);
	    System.out.println("Calling empty() after elements are added: " + st.empty());
	    System.out.println("Elements in the stack: " + st);

	    System.out.println("Index number of 50 counted from top: " + st.search(50));    
	    System.out.println("Index number of SNRao from top: " + st.search("SNRao"));

	    System.out.println("Element at the top: " + st.peek());
	    System.out.println("No. of elements before pop called: " + st.size());
	    System.out.println("Popped element: " + st.pop());
	    System.out.println("No. of elements after pop is called: " + st.size());

	    System.out.print("Technique of printing elements with empty():\n\t");
	    while( ! st.empty() )     
	    {		
	      System.out.print(st.pop( ) + " ") ;
	    }
	    System.out.println("\nNo. of elements after while loop: " + st.size());
	  }

}
