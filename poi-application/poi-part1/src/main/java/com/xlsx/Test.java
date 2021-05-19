package com.xlsx;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.model.Book;
import com.model.Product;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class Test {
	//European countries use ";" as 
    //CSV separator because "," is their digit separator
	   private static final String CSV_SEPARATOR = ",";
	    private static void writeToCSV(ArrayList<Product> productList)
	    {
	        try
	        {
	        	FileOutputStream fos = new FileOutputStream("products.csv");
	        	OutputStreamWriter osw =new OutputStreamWriter(fos, "UTF-8");
	            BufferedWriter bw = new BufferedWriter(osw);
	            for (Product product : productList)
	            {
	                StringBuffer oneLine = new StringBuffer();
	                oneLine.append(product.getId() <=0 ? "" : product.getId());
	                oneLine.append(CSV_SEPARATOR);
	                oneLine.append(product.getName().trim().length() == 0? "" : product.getName());
	                oneLine.append(CSV_SEPARATOR);
	                oneLine.append(product.getCostPrice() < 0 ? "" : product.getCostPrice());
	                oneLine.append(CSV_SEPARATOR);
	                oneLine.append(product.isVatApplicable() ? "Yes" : "No");
	                bw.write(oneLine.toString());
	                bw.newLine();
	            }
	            bw.flush();
	            bw.close();
	        }
	        catch (UnsupportedEncodingException e) {}
	        catch (FileNotFoundException e){}
	        catch (IOException e){}
	    }
	    public <T> void writeCSV(List<T> listBook, String csvFilePath) {
			
			try {
					FileOutputStream fos = new FileOutputStream(csvFilePath);
		        	OutputStreamWriter osw =new OutputStreamWriter(fos, "UTF-8");
		            BufferedWriter bw = new BufferedWriter(osw);
				    Object[] a = listBook.toArray();
				    String[] headers = new String[]{ "Book Name", "Author Name", "Book Price" };
				    for (int i=0;i<a.length;i++) {
				    	Book aBook = (Book) a[i];
				    	
				    	StringBuffer oneLine = new StringBuffer();
		                oneLine.append(aBook.getTitle());
		                oneLine.append(CSV_SEPARATOR);
		                oneLine.append(aBook.getAuthor());
		                oneLine.append(CSV_SEPARATOR);
		                oneLine.append(aBook.getPrice());
		                bw.write(oneLine.toString());
		                bw.newLine();
				    }
				    bw.flush();
		            bw.close();
				    
			} catch (UnsupportedEncodingException e) {}
	        catch (FileNotFoundException e){}
	        catch (IOException e){}
		}
	    private List<Book> getListBook() {
		    Book book1 = new Book("Head First Java", "Kathy Serria", "79");
		    Book book2 = new Book("Effective Java", "Joshua Bloch", "36");
		    Book book3 = new Book("Clean Code", "Robert Martin", "42");
		    Book book4 = new Book("Thinking in Java", "Bruce Eckel", "35");
		 
		    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
		 
		    return listBook;
		}
	    public static void main(String[] args)
	    {
	    	/*
	        ArrayList<Product> productList = new ArrayList<Product>();
	        productList.add(new Product(1, "Pen", 2.00, false));
	        productList.add(new Product(2, "TV", 300, true));
	        productList.add(new Product(3, "iPhone", 500, true));
	        writeToCSV(productList);
	        */
	        Test test = new Test();
		 
		    List<Book> listBook = test.getListBook();
			String csvFilePath = "D://test/download/NiceJavaBooks18.csv";
			 
			test.writeCSV(listBook, csvFilePath);
	    }
}
