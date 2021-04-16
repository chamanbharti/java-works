package com.java7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");) {
			  String msg = "welcome";
			  byte[] byteArray = msg.getBytes();
			  fileOutputStream.write(byteArray);
			  System.out.println("------------Data written into file--------------");  
		      System.out.println(msg); 
		} catch (Exception e) {
			System.out.println(e);
		}
		*/
		
		/*
		try(  FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
			  InputStream input = new FileInputStream("abc.txt");
		   ) {
			  //write data
			  String msg = "welcome";
			  byte[] byteArray = msg.getBytes();
			  fileOutputStream.write(byteArray);
			  System.out.println("------------Data written into file--------------");  
		      System.out.println(msg); 
		      
		      //read data
		      DataInputStream dis = new DataInputStream(input);
		      int data = input.available();
		      byte[] byteArray2 = new byte[data];
		      dis.read(byteArray2);
		      String str = new String(byteArray2);
		      System.out.println("------------Data read from file--------------");  
		      System.out.println(str); // display file data  
		} catch (Exception e) {
			System.out.println(e);
		}
		
		*/
		
		/*
		try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");) {
			  String msg = "welcome";
			  byte[] byteArray = msg.getBytes();
			  fileOutputStream.write(byteArray);
			  System.out.println("------------Data written into file--------------");  
		      System.out.println(msg); 
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			 System.out.println("Finally executes after closing of declared resources.");  
		}
		*/
		
		/*
		 // this  is not programmer friendly
		Reader reader = null;
		try {
			  reader = new FileReader("test.txt");
			  //reading a file
			  
			  
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader != null) {
				try {
					  reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		
		//after java 7
		/*
		// this concept called automatic resource management
		try (Reader reader = new FileReader("test.txt");){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		/*
		//Java 7 Resource Declared within resource block
		try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");) {
			  String msg = "welcome";
			  byte[] byteArray = msg.getBytes();
			  fileOutputStream.write(byteArray);
			  System.out.println("------------Data written into file--------------");  
		      System.out.println(msg); 
		} catch (Exception e) {
			System.out.println(e);
		}
		*/
		
		/*
		 This code executes fine with Java 7 and even with Java 9 because Java maintains it's legacy.
		 But the below program would not work with Java 7 because we can't put resource declared outside the try-with-resource.
		 */
		/*
		FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
		try(fileOutputStream) {
			  String msg = "welcome";
			  byte[] byteArray = msg.getBytes();
			  fileOutputStream.write(byteArray);
			  System.out.println("------------Data written into file--------------");  
		      System.out.println(msg); 
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		//above code will give error in java 7
		*/
		
		// after java 9
		FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
		try(fileOutputStream) {
			  String msg = "welcome";
			  byte[] byteArray = msg.getBytes();
			  fileOutputStream.write(byteArray);
			  System.out.println("------------Data written into file--------------");  
		      System.out.println(msg); 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
