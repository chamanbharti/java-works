package com.ArrayList.exercise;

import java.util.ArrayList;

public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		//create array list
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Initail size of al:"+al.size());
		//add element to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add(1,"A2");
		System.out.println("Size of al after addition:"+al.size());
		
		//display the array list
		System.out.println("Contents of al:"+al);
		
		//remove elements from array list
		al.remove("F");
		al.remove(7);
		//al.removeAll(al);
		System.out.println("Size of al after deletion:"+al.size());
		System.out.println("Contents of al:"+al);
	}

}
