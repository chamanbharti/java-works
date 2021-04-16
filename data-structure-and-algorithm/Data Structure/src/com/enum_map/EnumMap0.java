package com.enum_map;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * The java.util.EnumMap class is a specialized Map implementation for use with enum keys.Following are the important points about EnumMap:

All of the keys in an enum map must come from a single enum type that is specified, explicitly or implicitly, when the map is created.

Enum maps are maintained in the natural order of their keys.

EnumMap is not synchronized.If multiple threads access an enum map concurrently, and at least one of the threads modifies the map, it should be synchronized externally.

Class declaration
Following is the declaration for java.util.EnumMap class:

public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K,V> implements Serializable, Cloneable
Class constructors
S.N.	Constructor & Description
1	
EnumMap(Class<K> keyType)

This constructor creates an empty enum map with the specified key type.

2	
EnumMap(EnumMap<K,? extends V> m)

This constructor creates an enum map with the same key type as the specified enum map, initially containing the same mappings (if any).

3	
EnumMap(Map<K,? extends V> m)

This constructor creates an enum map initialized from the specified map.


 */
public class EnumMap0 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int count = 0;
		Class c = Class.forName("java.util.EnumMap");
		Method[] m = c.getDeclaredMethods();
		System.out.println("Method's name:");
		for(Method m1:m){
			count++;
			System.out.println(m1.getName()+"()");
		}
		System.out.println("Total methods are :"+count);
		
	}
}
