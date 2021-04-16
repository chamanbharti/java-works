package com.legacy.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	
	public static void main(String[] args) {
		
		System.out.println("\t****Properties Collection Class Demo****");
		
		//create properties class
		/*Properties p = new Properties();
		
		//add some properties
		p.put("Height", 200);
		p.put("Width", "500");
		p.put("Scannable", "true");
		*/
		
		/*//public String getProperty(String key)
		//This method searches for the property with the specified key in this property list.
		System.out.println(" \t *** getProperty(String key) ***");
		//get two properties and print them
		System.out.println(" \t "+ p.getProperty("Scannable"));
		System.out.println(" \t "+ p.getProperty("Width"));
		*/
		
		/*//public String getProperty(String key,String defaultValue)
		//This method searches for the property with the specified key in this property list.
		System.out.println(" \t *** getProperty(String key,String defaultValue) ***");
		//get two properties and print them
		System.out.println(" \t "+ p.getProperty("Scannable","false"));
		System.out.println(" \t "+ p.getProperty("Width","150"));
		*/
		
		/*//create properties class
		Properties p = new Properties();
		//add some properties
		//p.put(Height, "200");//CT:ClassCastException
		//p.put("Height", 200);//CT:ClassCastExcept
		p.put("Height", "200");
		p.put("Width", "500");
		p.put("Scannable", "true");
		//void list(PrintStream out)
		//This method prints this property list out to the specified output stream.
		System.out.println(" \t *** public void list(PrintStream out) ***");
		
		//print the list with System.out
		p.list(System.out);
		//ClassCastException -- if any key or value in this property list is not a string.
		*/
		
		/*
		//create properties class
		Properties p = new Properties();
		//create PrintWriter class
		PrintWriter writer = new PrintWriter(System.out);
		
		//add some properties
		//p.put(Height, "200");//CT:ClassCastException
		//p.put("Height", 200);//CT:ClassCastExcept
		p.put("Height", "200");
		p.put("Width", "500");
		p.put("Scannable", "true");
		
		//void list(PrintWriter out)
		//This method prints this property list out to the specified output stream.
		System.out.println(" \t *** public void list(PrintWriter out) ***");
		
		//print the list with a PrintWriter object
		p.list(writer);
		
		//flush the stream
		writer.flush();
		
		////ClassCastException -- if any key or value in this property list is not a string.
		*/
		
		/*
		//void load(InputStream inStream)
		 
		//This method reads a property list (key and element pairs) from the input byte s
		//IOException -- if an error occurred when reading from the input stream.
		//IllegalArgumentException -- if the input stream contains a malformed Unicode escape sequence.
		System.out.println(" \t *** public void load(InputStream inStream) ***");
		
		//create properties class
		Properties p = new Properties();
		//create PrintWriter class
		String s = "Height=200";
		String s2 = "Width=15";
		
		try{
				//create a new input and output stream
				FileOutputStream fos = new FileOutputStream("properties.txt");
				FileInputStream  fis = new FileInputStream("properties.txt");
				
				//write the first property in the output stream file
				fos.write(s.getBytes());
				
				//change the line between the two properties
				fos.write(" \n ".getBytes());
				
				//write the next property
				fos.write(s2.getBytes());
				
				//load from input stream
				p.load(fis);
				
				//print the properties list from System.out
				p.list(System.out);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	*/
		/*
		//void load(Reader reader)

		//This method reads a property list (key and element pairs) from the input character stream in
		//a simple line-oriented format.
		//IOException -- if an error occurred when reading from the input stream.
		//IllegalArgumentException -- if the input stream contains a malformed Unicode escape sequence.
		
		System.out.println(" \t *** public void load(Reader reader) ***");
		Properties p = new Properties();
		String s = "Height=200\nWidth=15";
		
		//create a new reader
		StringReader reader = new StringReader(s);
		
		try{
			//load from input stream
			p.load(reader);
			
			//print the propertes list from stream.out
			p.list(System.out);
			
		}catch(Throwable ex){
			ex.printStackTrace();
		}
		*/
		
		/*
		//void loadFromXML(InputStream in)

		//This method loads all of the properties represented by the XML document on the specified 
		//input stream into this properties table.
		
		//IOException -- if reading from the specified input stream results in an IOException.
		//InvalidPropertiesFormatException -- Data on input stream does not constitute a valid XML 
		//document with the mandated document type.
		//NullPointerException -- if in is null.
		System.out.println(" \t *** public void loadFromXML(InputStream in) ***");
		Properties p = new Properties();

	   // add some properties
	   p.put("Height", "200");
	   p.put("Width", "15");
	   
	   try{
		   //create a output and input as a xml file
		   FileOutputStream fos = new FileOutputStream("properties.xml");
		   FileInputStream  fis = new FileInputStream("properties.xml");
		   
		   //store the properties in specific xml
		   p.storeToXML(fos, null);
		   
		   //load from the xml that we saved earlier
		   p.loadFromXML(fis);
		   
		   //print the properties list
		   p.list(System.out);
	   }catch(Throwable ex){
		   ex.printStackTrace();
	   }
	   */
		
	   /*
		//Enumeration<?> propertyNames()

		//This method returns an enumeration of all the keys in this property list, 
		//including distinct keys in the default property list if a key of the same name has not 
		//already been found from the main properties list.
		
		//ClassCastException -- if any key in this property list is not a string.
		System.out.println(" \t *** public Enumeration<?> propertyNames() ***");
		//create property class
		Properties prop = new Properties();

	   // add some properties
	   prop.put("Height", "200");
	   prop.put("Width", "15");
	   
	   //assign the property names in an enumeration
	   Enumeration<?> enumeration = prop.propertyNames();
	   
	   //print the enumeration elements
	   System.out.println(" \t " +enumeration.nextElement() );
	   System.out.println(" \t " +enumeration.nextElement() );
	   */
		
		//void save(OutputStream out, String comments)

		//This method reads a.
		
		
		/*//Object setProperty(String key, String value)

		//This method calls the Hashtable method put.
		//this method calls the Hashtable method put. Provided for parallelism with the getProperty method. 
		//Enforces use of strings for property keys and values. The value returned is the result of the 
		//Hashtable call to put.
		
		System.out.println(" \t *** public Object setProperty(String key,String value) ***");
		
		//create Properties class
		Properties prop = new Properties();

	   // add some properties
	   prop.setProperty("Height", "200");
	   prop.setProperty("Width", "1500");
	   //prop.put("Width", "1500");
	   
	   //print the list
	   System.out.println(" \t " + prop);
	   
	   //change the properties
	   prop.setProperty("Width", "15");
	   prop.setProperty("Height", "500");
	   
	   //print the list
	   System.out.println(" \t " + prop);
	   */
	   
		/*
		  //void store(OutputStream out, String comments)

		The method writes this property list (key and element pairs) in this Properties table 
		to the output stream in a format suitable for loading into a Properties table using 
		the load(InputStream) method.
		
		IOException -- if writing this property list to the specified output stream throws an IOException.
		ClassCastException -- if this Properties object contains any keys or values that are not Strings.
		NullPointerException -- if out is null.
		
		System.out.println(" \t *** public void store(OutputStream out,String comments) ***");
		//create Properties class
		Properties prop = new Properties();

	   // add some properties
	   prop.setProperty("Height", "200");
	   prop.put("Width", "1500");
	   
	   //print the list
	   System.out.println(" \t " + prop);
	   
	   try{
		   //store the properties list in an output stream
		   prop.store(System.out, "propertyDemo");
	   }catch(Throwable ex){
		   ex.printStackTrace();
	   }
	   */
		
		/*
		//void store(Writer writer, String comments)

		The method writes this property list (key and element pairs) in this Properties table to the 
		output character stream in a format suitable for using the load(Reader) method.
		
		IOException -- if writing this property list to the specified output stream throws an IOException.
		ClassCastException -- if this Properties object contains any keys or values that are not Strings.
		NullPointerException -- if out is null.
		
		System.out.println(" \t *** public void store(Writer writer,String comments) ***");
		
		//create Properties class
		Properties prop = new Properties();
		StringWriter sw = new StringWriter();
		// add some properties
		 prop.setProperty("Height", "200");
		 prop.put("Width", "1500");
		 
		 //print the list
		 System.out.println(" \t " + prop);
		 
		 try{
			   //store the properties list in an output stream
			  // prop.store(System.out, "propertyDemo");
			   prop.store(sw, "propertyDemo");
			   
			   //print the writer
			   System.out.println(" \t " + sw.toString());
		   }catch(Throwable ex){
			   ex.printStackTrace();
		   }
		 */
		
		/*
		//void storeToXML(OutputStream os, String comment)

		//This method emits an XML document representing all of the properties contained in this table.
		IOException -- if writing this property list to the specified output stream throws an IOException.
		ClassCastException -- if this Properties object contains any keys or values that are not Strings.
		NullPointerException -- if out is null.
		
		System.out.println(" \t *** public void storeToXML(OutputStream os,String comment) ***");
		
		Properties prop = new Properties();

	   // add some properties
	   prop.put("Height", "200");
	   prop.put("Width", "15");
	   
	   try {

		   // create a output and input as a xml file
		   FileOutputStream fos = new FileOutputStream("properties.xml");
		   FileInputStream fis = new FileInputStream("properties.xml");

		   // store the properties in the specific xml
		   prop.storeToXML(fos, "Properties Example");

		   // print the xml
		   while (fis.available() > 0) {
		   System.out.print("" + (char) fis.read());
		   }

		   } catch (IOException ex) {
		   ex.printStackTrace();
		   }
		 	*/
		
		/*
		 //void storeToXML(OutputStream os, String comment, String encoding)

		This method emits an XML document representing all of the properties contained in this table,
		using the specified encoding.
		IOException -- if writing this property list to the specified output stream throws an IOException.
		ClassCastException -- if this Properties object contains any keys or values that are not Strings.
		NullPointerException -- if out is null.
		
		System.out.println(" \t *** public void storeToXML(OutputStream os,String comment, String encoding) ***");
		
		Properties prop = new Properties();
	
	   // add some properties
	   prop.put("Height", "200");
	   prop.put("Width", "15");	
	
	   try {
	
	   // create a output and input as a xml file
	   FileOutputStream fos = new FileOutputStream("properties.xml");
	   FileInputStream fis = new FileInputStream("properties.xml");
	
	   // store the properties in the specific xml and a different encoding
	   prop.storeToXML(fos, "Properties Example","ISO 8859");
	
	   // print the xml. Notice that ISO 8859 isn't supported
	   while (fis.available() > 0) {
	   System.out.print("" + (char) fis.read());
	   }
	
	   } catch (IOException ex) {
	   ex.printStackTrace();
	   }
   */
		//Set<String> stringPropertyNames()

		/*This method returns a set of keys in this property list where the key and its corresponding 
		value are strings, including distinct keys in the default property list if a key of the same 
		name has not already been found from the main properties list.*/
		System.out.println(" \t *** public Set<String> stringPropertyNames() ***");
		
		Properties prop = new Properties();

		   // add some properties
		   prop.put("Height", "200");
		   prop.put("Width", "15");
		   
		   //save the Property name is the set
		   Set<String> set = prop.stringPropertyNames();
		  //print the set
		   System.out.println(" \t " + set);
		   // assign the property names in a enumaration
		   Enumeration<?> enumeration = prop.propertyNames();
		   System.out.println(" \t " + enumeration.nextElement());
		   System.out.println(" \t " + enumeration.nextElement());

		   
		
	   
	}

}
