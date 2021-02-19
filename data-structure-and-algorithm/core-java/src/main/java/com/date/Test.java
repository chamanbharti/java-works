package com.mps.think;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		//String string = "Oct 19, 2017 9:15:12 PM";
		String string = "08/31/2020 11:41:41";
    	DateFormat inFormat = new SimpleDateFormat( "MMM dd, yyyy hh:mm:ss aa");

        //This is already in 24 hour format so the output would be no different
    	String string2 = "2016-09-23 19:10:22";
    	DateFormat inFormat2 = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss");

    	String string3 = "12-09-2014 01:10 PM";
    	DateFormat inFormat3 = new SimpleDateFormat( "dd-MM-yyyy hh:mm aa");

        /* This is a 24 hour date time format that we are using to convert all 
         * input date and time formats to this format.
         */
    	DateFormat outFormat = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss");
    	Date date = null;
    	Date date2 = null;
    	Date date3 = null;
    	try
    	{
    	    date = inFormat.parse(string);
    	    date2 = inFormat2.parse(string2);
    	    date3 = inFormat3.parse(string3);
    	}
    	catch (ParseException e )
    	{
    	        e.printStackTrace();
    	}
    	if( date != null )
    	{
    	    String myDate = outFormat.format(date);
    	    String myDate2 = outFormat.format(date2);
    	    String myDate3 = outFormat.format(date3);
    	    System.out.println(myDate);
    	    System.out.println(myDate2);
    	    System.out.println(myDate3);
    	}
    }

}
