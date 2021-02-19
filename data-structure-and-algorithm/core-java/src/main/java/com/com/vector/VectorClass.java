package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();
		int primitiveType = 10;
		Integer wrapperType = new Integer(20);
		String str = "Chaman Bharti";
		
		vector.add(primitiveType);
		vector.add(wrapperType);
		vector.add(str);
		vector.add(2,new Integer(30));
		System.out.println("The element of vector: "+vector);
		System.out.println("The size of vector are: "+vector.size());//4
		System.out.println("The elements at position 2 is : "+vector.elementAt(2));//30
		System.out.println("The first element of vector is : "+vector.firstElement());//10
		System.out.println("The first element of vector is : "+vector.lastElement());//chaman bharti
		
		vector.remove(2);
		Enumeration e = vector.elements();
		System.out.println("The elements of vector: "+vector);//[10,10,chaman bharti]
		while(e.hasMoreElements()){
			System.out.println("The elements are: "+e.nextElement());
		}
	}

}
