package com.formatter;

import java.util.Formatter;
import java.util.Locale;

public class FormatterDemo1 {
	
	public static void main(String[] args) {
		
		// close()
		System.out.println("***** close() *****");
		//create formatter
		StringBuffer buffer = new StringBuffer();
		Formatter formatter = new Formatter(buffer, Locale.US);
		
		//format a new string
		String name = "World";
		formatter.format("Hello %s !", name);
		
		//print formatted string
		System.out.println(""+formatter);
		
		/*//close the formatter
		formatter.close();
		
		//attempt to access the formatter results in exception
		System.out.println(""+formatter);//Exception in thread "main" java.util.FormatterClosedException
		*/	
		
		// flush()
		
		//flush the formatter. here it does nothing.
		/*formatter.flush();
		System.out.println("Formatter Flushed.");*/
		
		// format() 1
		System.out.println("***** format() 1 *****");
		formatter.format(Locale.US, "Hello %s !", name);
		// print the formatted string with specified locale
		System.out.println("" + formatter + " " + formatter.locale());
		
		// format() 2
		System.out.println("***** format() 2 *****");
		formatter.format("Hello %s", name);
		//print the formatted string with default locale
		System.out.println(""+formatter+" "+formatter.locale());
		
		// ioException()
		System.out.println("***** ioException() *****");
		// print latest exception, which is null
		System.out.println("" + formatter.ioException());
		
		// locale()
		System.out.println("***** locale() *****");
		//print locale
		System.out.println(""+formatter.locale());
		
		// out()
		System.out.println("***** out() *****");
		System.out.println(""+formatter.out());
		
		// toString()
		System.out.println("***** toString() *****");
		// print the formatter as a string
		System.out.println("" + formatter.toString());


	}
	

}
