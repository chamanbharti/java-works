package act21.csv;

import java.io.File;
import java.util.Scanner;

public class ReadEmployee {
	public static void main(String[] args) {
		
		try {
				//parsing a CSV file into Scanner class constructor  
				Scanner sc = new Scanner(new File("D:\\act21/employee.csv"));  
				sc.useDelimiter(",");   //sets the delimiter pattern  
				while (sc.hasNext())  //returns a boolean value  
				{  
					System.out.print(sc.next()+",");  //find and returns the next complete token from this scanner  
				}   
				sc.close();  //closes the scanner  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
