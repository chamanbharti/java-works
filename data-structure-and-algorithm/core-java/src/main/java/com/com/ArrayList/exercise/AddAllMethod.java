package com.ArrayList.exercise;
import java.util.*;
class AddAllMethod
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();
		System.out.println();
		al.add("Rahi");
		al.add("Chaman");
		al.add("Sahil");
		ArrayList al2=new ArrayList();
		al2.add("Nasrin");
		al2.add("Aman");
		al2.add("Naman");

		al.addAll(al2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}