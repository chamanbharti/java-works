package act21.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadOutputSampleFile {
	public static void main(String[] args) {
		String line = "";
		String splitBy = ",";
		try {
				// parsing a CSV file into BufferedReader class constructor
				BufferedReader br = new BufferedReader(new FileReader("D:\\Act21/output_sample.csv"));
				while ((line = br.readLine()) != null) // returns a Boolean value
				{
					String[] output_sample = line.split(splitBy); // use comma as separator
					System.out.println("Transaction [emp_id=" + output_sample[0] + ", emp_name=" + output_sample[1]
							+ ", location_category=" + output_sample[2]+ ", amount=" + output_sample[3]+"]");
				}
				br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
