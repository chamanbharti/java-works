package com.ArrayList.exercise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListDemo0 
{
	public static void main(String[] args) 
	{
//		ArrayList<Boolean> list = new ArrayList<Boolean>();
//	    //list.add(true);
//	    list.add(false);
//	    boolean flag = list.get(0);
//	    System.out.println(list);
		Vector v=new Vector();
		v.add("Chaman");
		System.out.println(v.capacity());
		ArrayList list = new ArrayList();
	    LinkedList list2=new LinkedList();
	   System.out.println(list instanceof Serializable);//true
	   System.out.println(list instanceof Cloneable);//true
	   System.out.println(list2 instanceof Serializable);//true
	   System.out.println(list instanceof RandomAccess);//true
	   System.out.println(list2  instanceof  RandomAccess);//false
	  
	  
	}

}
