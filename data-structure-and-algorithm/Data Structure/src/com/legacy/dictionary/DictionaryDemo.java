package com.legacy.dictionary;

import java.util.Dictionary;
import java.util.Hashtable;
/*
 * Dictionary Class: it has total 7 methods and all methods are abstract method 
 * becuase Dictionary is abstract class.
 
 * The java.util.Dictionary class is the abstract parent of any class, such as Hashtable, 
 * which maps keys to values.
 
 * Following are the important points about Dictionary:
In this class every key and every value is an object.
In his class object every key is associated with at most one value.

Class declaration:
Following is the declaration for java.util.Dictionary class:

public abstract class Dictionary<K,V> extends Object

Class constructors:
	
Dictionary() 

It is known as sole constructor

This is the single constructor.
 */
// Dictionar class contains 7 methods and 1 constructor.
//In this program I will show you how to implimentation 7 methods and where to use.
public class DictionaryDemo {
	public static void main(String[] args) {
		
		System.out.println("\t****Dictionary Collection Demo****");
		
		//create a new Hashtable
		Dictionary d = new Hashtable<>();//here dictionary is a abstract class and hashtable is class that 
		                                 //extend dictionary class
		//add 2 elements
		d.put(1, "Cocoa");
		d.put(4, "Chocolate"+"Bar");
		d.put(6, "Coffee");
		
		System.out.println("\t\"1\" is "+d.get(1));
		System.out.println("\t\"4\" is "+d.get(4));
		
		/*
		//public abstract Enumeration<V> elements()
		//This method returns an enumeration of the values in this dictionary.
		 * System.out.println("\t****elements()****");
		//generates a series of elements, one at a time
		for(Enumeration e = d.elements();e.hasMoreElements();){
			System.out.println("\t"+e.nextElement());
		}*/
		
		/*System.out.println("\t****get()****");
		//public abstract V get(Object key)
		//This method returns the value to which the key is mapped in this dictionary.
		//returns the elements associated with the key
		System.out.println("\t"+d.get(6));
		
		System.out.println("\t****isEmpty()****");
		//public abstract boolean isEmpty()
		//This method returns true if this dictionary has no keys to values; false otherwise.
		//This method tests if this dictionary maps no keys to value.
		//returns true if this dictionary maps no keys to value
		boolean b = d.isEmpty();
		System.out.println("\t Dictionary is empty: "+b);*/
		
		/*System.out.println("\t****keys()****");
		//public abstract Enumeration<K> keys()
		//This method returns an enumeration of the keys in this dictionary.
		//return an enumeration of the keys from this dictionary
		for(Enumeration ee=d.keys();ee.hasMoreElements();){
			System.out.println("\t"+ee.nextElement());
		}*/
		
		/*System.out.println("\t****put()****");
		//public abstract V put(K key,V value)
		//This method returns the value to which the key was mapped in this dictionary, or null if the key did not have a mapping.
		//This method maps the specified key to the specified value in this dictionary.
		//NullPointerException -- if the value or key is null
		//d.put(5, null);
		//d.put(null, "Cadbury");
		d.put(5, "Cadbury");*/
		
		/*System.out.println("\t****remove()****");
		//public abstract V remove(Object key)
		//This method removes the key (and its corresponding value) from this dictionary.
		//This method returns the value to which the key had been mapped, or null if the key did not have a mapping.
		//NullPointerException -- if key is null.
		System.out.println("\t" +d.get(5) ); //remove one element
		System.out.println("\t" +d.remove(5) + " has been removed");
		System.out.println("\t" +d.get(5) );*/
		
		/*System.out.println("\t****size()****");
		//public abstract int size()
		//This method returns the number of entries (distinct keys) in this dictionary.
		//This method returns the number of keys in this dictionary.
		//print the size of dictionary
		System.out.println("\t Size of Dictionary:" + d.size());// output will be 3
        */

	}

}
