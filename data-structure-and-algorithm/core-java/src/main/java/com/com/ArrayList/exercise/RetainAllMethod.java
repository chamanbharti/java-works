package com.ArrayList.exercise;
import java.util.*;
class RetainAllMethod
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();
		al.add("Rahi");
		al.add("Chaman");
		al.add("Sahil");

		ArrayList al2=new ArrayList();
		al2.add("Rahi");
		al2.add("Aman");
		al2.add("Naman");

		al.retainAll(al2);
		
		System.out.println("iterating the elements after retaining the elements of al2..");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}