package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayArrayList1 {
	public static void main(String[] args) {
		
		//ArrayList Example
		ArrayList<String> arraylistobj=new ArrayList<String>();
		arraylistobj.add("Alive is awesome");
		arraylistobj.add("Love yourself");
		arraylistobj.add("My name is Chaman Bharti");
		
		//iterator
		/*Iterator it=arraylistobj.iterator();
		System.out.println("ArrayList object output:");
		while(it.hasNext())
			System.out.println(it.next());
		//it.remove();
		//arraylistobj.remove(0);
		//arraylistobj.remove("Love yourself");
		 */	
		
		//ListIterator
		//ListIterator Interface is used to traverse the element in backward and forward direction.
		ListIterator<String> listIterator = arraylistobj.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
			//listIterator.remove();
			arraylistobj.remove(arraylistobj);
		}
		//For-each
		/*System.out.println("For-each ");
		for(String s:arraylistobj){
			System.out.println(s);
			arraylistobj.remove(0);
		}*/
		//Array Example
		/*String[]arrayobj=new String[3];
		arrayobj[0]="Alive is awesome";
		arrayobj[1]="Love yourself";
		arrayobj[2]="My name is Chaman Bharti";
		
		System.out.println("Array object output");
		for(int i=0;i<arrayobj.length;i++)
			System.out.println(arrayobj[i]+" ");*/
	}

}
