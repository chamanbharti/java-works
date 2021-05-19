package com.xlsx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.model.Book;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class GenericCSVWriterFinal {

	public <T> void writeCSV(List<T> listBook, String csvFilePath) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
	   
		try{
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(csvFilePath);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);
					
			// adding header to csv
	       // String[] header = { "Name", "Class", "Marks" };
	        String[] header = { "Book Name", "Author Name", "Book Price" };
	        //writer.writeNext(header);
	        
			//Object[] a = listBook.toArray();
			//List<Object> data = new ArrayList<>(listBook);
			// create a List which contains String array
			//String[] stringArray = Arrays.copyOf(a, a.length, String[].class);
			//String[] stringArray = Arrays.stream(a).toArray(String[]::new);
			
			//String[] stringArray = Arrays.stream(a).map(Object::toString).toArray(String[]::new);
			//System.out.println(Arrays.toString(stringArray));
			
			//List<String[]> data = new ArrayList<String[]>();
			//data.add(stringArray);
			
			//data.add(new String[] { "Name", "Class", "Marks" });
			//data.add(new String[] { "Aman", "10", "620" });
			//data.add(new String[] { "Suraj", "10", "630" });
	        
	        
	        Object[] a = listBook.toArray();
	    	List<Book> data = new ArrayList<>();
	    	
		    for (int i=0;i<a.length;i++) {
		    	Book aBook = (Book) a[i];
		    	data.add(aBook);
		    }
		    
		    String[] arr = new String[data.size()];
		    for (int i =0; i < data.size(); i++) {
	            arr[i] = data.get(i);
		    }
		    //String[] arr = data.toArray(new String[0]);
		   // String[] arr = data.stream().toArray(String[] ::new);
		   // writer.writeNext(data.toArray(new String[data.size()]));
		    writer.writeNext(arr);
		    
		    writer.close();
		    //
			//writer.writeAll(data);
			//writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	 
	}
	
	/**
	 	// create FileWriter object with file as parameter
		FileWriter outputfile = new FileWriter(file);

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// create a List which contains String array
		List<String[]> data = new ArrayList<String[]>();
		data.add(new String[] { "Name", "Class", "Marks" });
		data.add(new String[] { "Aman", "10", "620" });
		data.add(new String[] { "Suraj", "10", "630" });
		writer.writeAll(data);

		// closing writer connection
		writer.close();
	 */
//	private void writeBook(Book aBook, XSSFRow row) {
	private void writeBook(List<Object> listBook, String csvFilePath) {
		// create a List which contains String array
		List<String[]> data = new ArrayList<String[]>();
		data.add(new String[] { "Name", "Class", "Marks" });
		data.add(new String[] { "Aman", "10", "620" });
		data.add(new String[] { "Suraj", "10", "630" });
		try(FileWriter outputfile = new FileWriter(csvFilePath)){
			// create FileWriter object with file as parameter
			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);
			writer.writeAll(data);
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private List<Book> getListBook() {
	    Book book1 = new Book("Head First Java", "Kathy Serria", "79");
	    Book book2 = new Book("Effective Java", "Joshua Bloch", "36");
	    Book book3 = new Book("Clean Code", "Robert Martin", "42");
	    Book book4 = new Book("Thinking in Java", "Bruce Eckel", "35");
	 
	    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
	 
	    return listBook;
	}
	
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		
		GenericCSVWriterFinal csvWriter = new GenericCSVWriterFinal();
		 
		List<Book> listBook = csvWriter.getListBook();
		String csvFilePath = "D://test/download/NiceJavaBooks18.csv";
		 
		csvWriter.writeCSV(listBook, csvFilePath);
		System.out.println("success");
	}
}
