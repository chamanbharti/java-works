package act21.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadtransactionFile {
	public static void main(String[] args) {
		
		String line = "";
		String splitBy = ",";
		try {
				//step 1
				//parsing a CSV file into Scanner class constructor  
//				Scanner sc = new Scanner(new File("D:\\act21/transaction.csv"));  
//				sc.useDelimiter(",");   //sets the delimiter pattern  
//				while (sc.hasNext())  //returns a boolean value  
//				{  
//					System.out.print(sc.next()+"\t");  //find and returns the next complete token from this scanner  
//				}   
//				sc.close();  //closes the scanner
				
				//step 2
				// parsing a CSV file into BufferedReader class constructor
				BufferedReader br = new BufferedReader(new FileReader("D:\\Act21/transaction.csv"));
				while ((line = br.readLine()) != null) // returns a Boolean value
				{
					String[] transaction = line.split(splitBy); // use comma as separator
					System.out.println("Transaction [trans_id=" + transaction[0] + ", trans_product_type=" + transaction[1]
							+ ", trans_type=" + transaction[2]+ ", trans_amount=" + transaction[3]
									+", trans_parent_id=" + transaction[4]+", priority=" + transaction[5]
											+", emp_id=" + transaction[6]+"]");
				}
				br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}