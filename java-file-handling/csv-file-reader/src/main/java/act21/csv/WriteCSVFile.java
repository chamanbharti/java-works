package act21.csv;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class WriteCSVFile {

	public static void main(String[] args) throws Exception
	   {
	      String csv = "D:\\Act21/data2.csv";
	      CSVWriter writer = new CSVWriter(new FileWriter(csv));
	      
//	    // adding header to csv 
//	      String[] header = { "ID", "First Name", "Last Name", "Country", "Age" };
//	      writer.writeNext(header); 
//	      //Create record
//	      String [] record = "4,David,Miller,Australia,30".split(",");
//	      //Write the record to file
//	      writer.writeNext(record);
	      
	      // create a List which contains String array 
	        List<String[]> data = new ArrayList<String[]>(); 
	        data.add(new String[] { "Name", "Class", "Marks" }); 
	        data.add(new String[] { "Aman", "10", "620" }); 
	        data.add(new String[] { "Suraj", "10", "630" }); 
	        writer.writeAll(data);
	        
	      //close the writer
	      writer.close();
	   }
}
