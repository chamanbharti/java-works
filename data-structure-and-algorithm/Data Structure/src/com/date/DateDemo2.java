package com.date;

import java.lang.reflect.Method;
import java.util.Date;

public class DateDemo2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException {
		
		//create 2 dates
		Date date1 = new Date(2011,5,21);
		Date date2 = new Date(2015,1,21);
		
		//	after()
		//test if date2 is after date1 and print
		boolean after = date2.after(date1);
		System.out.println("Date2 is after date1: "+after);
		
		//test if date1 is after date2 and print
		after = date1.after(date2);
		System.out.println("Date2 is after date1: "+after);
		
		//	befor()
		  //tests if date2 is before date1 and print
		   boolean before = date2.before(date1);
		   System.out.println("Date2 is before date1: " + before);

		   // tests if date1 is before date2 and print
		   before = date1.before(date2);
		   System.out.println("Date1 is before date2: " + before);
		   
		   // clone()
		   Date date3 = new Date(98, 5, 21);
		   
		   // clone it to a second date
		   Object date4 = date3.clone();
		   
		   //print the results
		   System.out.println("Original Date3: "+date3.toString());
		   System.out.println("Cloned date4: "+date4);
		   
		   // compareTo()
		   // make 3 comparisons with them
		   int comparison = date1.compareTo(date2);
		   int comparison2 = date2.compareTo(date1);
		   int comparison3 = date3.compareTo(date2);

		   // print the results
		   System.out.println("Comparison Result:" + comparison);
		   System.out.println("Comparison2 Result:" + comparison2);
		   System.out.println("Comparison3 Result:" + comparison3);
		   
		   // equals()
		   
		// create 2 dates
		   Date date5 = new Date(70, 1, 10);
		   Date date6 = new Date(70, 1, 10);

		   /// Check if they are equal
		   boolean check = date5.equals(date6);

		   // print the result
		   System.out.println("Dates are equal:" + check);
		   
		  // getTime()
		Date date7 = new Date(97,1,23);
		long diff = date7.getTime();
		System.out.println("Date: "+date7.getDate()+" day: "+date7.getDay());
		// print how many seconds have passed since January 1, 1970, 00:00:00 GMT
		System.out.println("If date is 23-01-1997, " + diff + " have passed");
		
		// hashCode()
		System.out.println("current date shows: "+date7);
		//get hash code
		System.out.println("hashcode for thid date: "+date7.hashCode());
		
		// setTime()
	   Date date8 = new Date(92, 1, 10);
	   
	   System.out.println("Time before setting:  " + date8.toString());
	   // set the time for 10000 milliseconds after
	   // january 1, 1970 00:00:00 gmt.
	   date8.setTime(10000);
	   
	   // toString()
	   
	   System.out.println("Time after setting:  " + date8.toString());
	   
	 //find how many methods are in Dictionary class
		int count = 0;
		Class c = Class.forName("java.util.Date");
		Method[] m = c.getDeclaredMethods();
		System.out.println("Method's name:");
		for(Method m1:m){
			count++;
			System.out.println(m1.getName()+"()");
		}
		System.out.println("The number of method: "+count);

	}

}
