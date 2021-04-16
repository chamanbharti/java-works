package com.ArrayList.exercise;
import java.util.*;
class RemoveAllMethod
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();
		al.add("Rahi");
		al.add("Chaman");
		al.add("Sahil");

		ArrayList al2=new ArrayList();
		al2.add("Rahi");
		al2.add("Sahil");
		al2.add("Naman");

		//al.removeAll(al2);
		
		System.out.println("iterating the elements after removing the elements of al2..");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//al.remove(1);//Exception in thread "main" java.util.ConcurrentModificationException
		}

	}

}