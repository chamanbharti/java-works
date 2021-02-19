package com.enum_set;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/*
The java.util.EnumSet class is a specialized Set implementation for use with enum types.Following are the important points about EnumSet:

All of the elements in an enum set must come from a single enum type that is specified, explicitly or implicitly, when the set is created.

Enum sets are represented internally as bit vectors.

EnumSet is not synchronized.If multiple threads access an enum set concurrently, and at least one of the threads modifies the set, it should be synchronized externally.

Class declaration
Following is the declaration for java.util.EnumSet class:

public abstract class EnumSet<E extends Enum<E>>
   extends AbstractSet<E>
   implements Cloneable, Serializable

 */
public class EnumSet0 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int count = 0;
		Class c = Class.forName("java.util.EnumSet");
		Method[] m = c.getDeclaredMethods();
		System.out.println("Method's name:");
		for(Method m1:m){
			count++;
			System.out.println(m1.getName()+"()");
		}
		System.out.println("Total methods are :"+count);
		
	}
}
