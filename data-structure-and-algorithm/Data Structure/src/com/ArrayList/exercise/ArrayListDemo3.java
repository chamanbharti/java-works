package com.ArrayList.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rahi");
		al.add("Chaman");
		al.add("Nasrin");
		al.add("Sahil");
		al.add("Aman");
		al.add("Naman");
		System.out.println("Array Size "+al.size());
		//al.remove(5);//Exception in thread "main" java.util.ConcurrentModificationException
		for (String string : al) 
		{
			System.out.println(string);
			//al.remove(1);//Exception in thread "main" java.util.ConcurrentModificationException
		}
		/*for (Object obj : al) 
		{
			System.out.println(obj);
			//al.remove(1);//Exception in thread "main" java.util.ConcurrentModificationException
		}*/
	}

}
