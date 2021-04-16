package com.ArrayList.exercise;
import java.util.*;
public class Simple 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rahi");
		al.add("Chaman");
		al.add("Sahil");
		al.add("Aman");
		al.add("Naman");
		
		Collections.sort(al);
		//Arrays.sort(al);
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
