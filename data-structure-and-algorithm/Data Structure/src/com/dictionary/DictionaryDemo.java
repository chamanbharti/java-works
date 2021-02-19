package com.dictionary;

import java.lang.reflect.Method;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/*
 The java.util.Dictionary class is the abstract parent of any class, such as Hashtable, which maps keys to values.
 Following are the important points about Dictionary:

In this class every key and every value is an object.

In his class object every key is associated with at most one value.
 * Class declaration
Following is the declaration for java.util.Dictionary class:

public abstract class Dictionary<K,V> extends Object
Class constructors
S.N.	Constructor & Description
1	Dictionary()
This is the single constructor.
 */
public class DictionaryDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//create a new hashtable
		Dictionary d = new Hashtable();
		
		// put()
		//add 2 elements
		d.put(1, "Coca");
		d.put(4, "Chocolate"+"Bar");
		d.put("2", "Coffee");
		
		System.out.println(" \"1\" is "+d.get(1));
		System.out.println(" \"1\" is "+d.get(4));
		
		// elements()
		
		//generates a series of elements, one at a time
		System.out.println("elements() with enumeration");
		for(Enumeration e = d.elements(); e.hasMoreElements();){
			System.out.println(e.nextElement());
		}
		
		// get()
		Dictionary d2 = new Hashtable();
		d2.put("1", "Chocolate");
		d2.put("2", "Cocoa");
		d2.put("6", "Coffee");
		System.out.println("get():");
		System.out.println(d.get("2"));
		System.out.println(d2.get("6"));
		
		/*Dictionary d2 = new Hashtable();
		d2.put("Chocolate","10");
		d2.put("Cocoa","3");
		d2.put("Coffee","4");
		System.out.println("get():");
		System.out.println(d.get("4"));
		System.out.println(d2.get("Chocolate"));*/
		// isEmpty()
		boolean b = d2.isEmpty();
		System.out.println("isEmpty():");
		System.out.println("Dictionary is empty: "+b);
		
		// keys()
		System.out.println("Keys() with enumeration");
		for(Enumeration e = d2.keys(); e.hasMoreElements();){
			System.out.println(e.nextElement());
		}
		
		// remove()
		System.out.println(d2.remove("6")+" has been removed");
		System.out.println("d2 elements: "+d2);
		
		// size()
		System.out.println("Size of Dictionary d: "+d.size());
		System.out.println("Size of Dictionary d2: "+d2.size());
		
		//find how many methods are in Dictionary class
		int count = 0;
		Class c = Class.forName("java.util.Dictionary");
		Method[] m = c.getDeclaredMethods();
		System.out.println("Method's name:");
		for(Method m1:m){
			count++;
			System.out.println(m1.getName()+"()");
		}
		System.out.println("The number of method: "+count);
		
		// how to find package name
		System.out.println("Package Details:");
		/*Class c1 = Class.forName("java.util.Dictionary");
		Class c2 = c1.getClass();
		System.out.println("Package: "+c2.getPackage()+"\nClass: "+c2.getSimpleName()+"\nFull Identifier: "+c2.getName());*/
		Package pack = d.getClass().getPackage();
		System.out.println("Package Name = "+pack);
		
	}
	
}
