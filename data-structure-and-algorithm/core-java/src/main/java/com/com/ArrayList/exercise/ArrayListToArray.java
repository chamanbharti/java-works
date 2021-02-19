package com.ArrayList.exercise;

import java.util.ArrayList;

public class ArrayListToArray 
{
	public static void main(String[] args) 
	{
		//create array list
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Initail size of al:"+al.size());
		//add element to the array list
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("Size of al after addition:"+al.size());
		
		//display the array list
		System.out.println("Contents of al:"+al);
		
		//get the array
		Integer ia[]=new Integer[al.size()];
		ia=al.toArray(ia);
		
		int sum=0;
		//sum the array
		for (int i : ia) 
		{
			sum=sum+i;
		}
		System.out.println("Sum is :"+sum);
	}

}

