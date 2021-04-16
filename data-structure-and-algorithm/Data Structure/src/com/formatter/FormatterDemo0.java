package com.formatter;

import java.lang.reflect.Method;

/*
 * The java.util.Formatter class provides support for layout justification and alignment, common formats for numeric, string, and date/time data, and locale-specific output.Following are the important points about Formatter:

Formatters are not necessarily safe for multithreaded access.Thread safety is optional and is the responsibility of users of methods in this class.

Class declaration
Following is the declaration for java.util.Formatter class:

public final class Formatter
   extends Object
   implements Closeable, Flushable
Class constructors
S.N.	Constructor & Description
1	
Formatter()

This constructor constructs a new formatter.

2	
Formatter(Appendable a)

This constructor constructs a new formatter with the specified destination.

3	
Formatter(Appendable a, Locale l)

This constructor constructs a new formatter with the specified destination and locale.

4	
Formatter(File file)

This constructor constructs a new formatter with the specified file.

5	
Formatter(File file, String csn)

This constructor constructs a new formatter with the specified file and charset.

6	
Formatter(File file, String csn, Locale l)

This constructor constructs a new formatter with the specified file, charset, and locale.

7	
Formatter(Locale l)

This constructor constructs a new formatter with the specified locale.

8	
Formatter(OutputStream os)

This constructor constructs a new formatter with the specified output stream.

9	
Formatter(OutputStream os, String csn)

This constructor constructs a new formatter with the specified output stream and charset.

10	
Formatter(OutputStream os, String csn, Locale l)

This constructor constructs a new formatter with the specified output stream, charset, and locale.

11	
Formatter(PrintStream ps)

This constructor constructs a new formatter with the specified print stream.

12	
Formatter(String fileName)

This constructor constructs a new formatter with the specified file name.

13	
Formatter(String fileName, String csn)

This constructor constructs a new formatter with the specified file name and charset.

14	
Formatter(String fileName, String csn, Locale l)

This constructor constructs a new formatter with the specified file name, charset, and locale.

 */
public class FormatterDemo0 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		int count = 0;
		Class c = Class.forName("java.util.Formatter");
		Method [] m = c.getDeclaredMethods();
		for(Method m1:m){
			count++;
			System.out.println(m1+"()");
		}
		System.out.println("Total methods: "+count);
	}

}
