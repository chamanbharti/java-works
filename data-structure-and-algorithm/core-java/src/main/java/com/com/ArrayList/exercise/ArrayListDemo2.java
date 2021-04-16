package com.ArrayList.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 
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
		//System.out.println("Output "+al);
		//Iterator<String> itr=al.iterator();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			System.out.print(itr.next()+"\t");
			//al.remove(1);//Exception in thread "main" java.util.ConcurrentModificationException
			
		}
		
	}

}
