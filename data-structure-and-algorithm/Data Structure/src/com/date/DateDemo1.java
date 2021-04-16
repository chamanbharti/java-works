package com.date;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
/*
 	Class declaration
Following is the declaration for java.util.Date class:

public class Date extends Object implements Serializable, Cloneable, Comparable<Date>
Class constructors
S.N.	Constructor & Description
1	Date()
This constructor allocates a Date object and initializes it so that it represents the time at which it was allocated, measured to 
the nearest millisecond.
2	Date(long date)
This constructor allocates a Date object and initializes it to represent the specified number of milliseconds since 
the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
 */
public class DateDemo1 {
	public static void main(String[] args) {
		
		// sql date package
		   Date date1= new Date(70,1,10);//java.util.Date
		   System.out.println("Date of java.util.Date: "+date1);
		   
		   java.sql.Date date2= new java.sql.Date(70,1,10);//java.sql.Date
		   System.out.println("Date of java.sql.Date: "+date2);
		   
		   Time time = new Time(5, 12, 12);
		   System.out.println("Time of java.sql.Time: "+time);
		   
		   Timestamp time2 = new Timestamp(15, 2, 1, 2, 10, 25, 11);
		   System.out.println("Date and Time of java.sql.TimeStamp: "+time2);
		   
		   
	}

}
