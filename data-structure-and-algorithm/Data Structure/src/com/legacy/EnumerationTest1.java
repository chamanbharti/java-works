package com.legacy;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest1 
{
	public static void main(String[] args) 
	{
		Enumeration<String> days;
		Vector<String> dayNames=new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wenesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saterday");
		days=dayNames.elements();
		while(days.hasMoreElements())
		{
			System.out.print(days.nextElement());
			System.out.print("\t");
		}
	}

}
