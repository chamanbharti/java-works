package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSVFile2 {
	public static void main(String[] args) {
		
		String line = "";
		String splitBy = ",";
		try {
				//step 1
				//parsing a CSV file into Scanner class constructor  
				Scanner sc = new Scanner(new File("D:\\act21/employee.csv"));  
				sc.useDelimiter(",");   //sets the delimiter pattern  
				while (sc.hasNext())  //returns a boolean value  
				{  
				System.out.print(sc.next()+"\t");  //find and returns the next complete token from this scanner  
				}   
				sc.close();  //closes the scanner
				
				//step 2
//				// parsing a CSV file into BufferedReader class constructor
//				BufferedReader br = new BufferedReader(new FileReader("D:\\Act21/employee.csv"));
//				while ((line = br.readLine()) != null) // returns a Boolean value
//				{
//					String[] employee = line.split(splitBy); // use comma as separator
//					System.out.println("Employee [emp_id=" + employee[0] + ", name=" + employee[1]
//							+ ", location=" + employee[2]+"]");
//				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}