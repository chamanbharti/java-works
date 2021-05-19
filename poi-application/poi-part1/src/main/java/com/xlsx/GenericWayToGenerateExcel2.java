package com.xlsx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.model.Book;

public class GenericWayToGenerateExcel2 {

	 public static void main(String[] args) throws IOException {
	  GenericExcelWriterFinal2 excelWriter = new GenericExcelWriterFinal2();
		 
		List<Book> listBook = excelWriter.getListBook();
		writeFileUsingPOI(listBook);
	 }
	 
	 private static <T> void writeFileUsingPOI(List<T> listBook) throws IOException {

	  //create blank workbook
	  XSSFWorkbook workbook = new XSSFWorkbook(); 
	 
	  //Create a blank sheet
	  XSSFSheet sheet = workbook.createSheet("Country");
	 
//	  ArrayList<Object[]> data=new ArrayList<Object[]>();
//listBook:	  
	  Object[] a = listBook.toArray();

	  List<Object> list = Arrays.asList(a);

      System.out.println(list);
//a & listBook:// [Book [title=Head First Java, author=Kathy Serria, price=79], Book [title=Effective Java, author=Joshua Bloch, price=36], Book [title=Clean Code, author=Robert Martin, price=42], Book [title=Thinking in Java, author=Bruce Eckel, price=35]]	  
//	  ArrayList<Object[]> data = new ArrayList<>();
//	  for(Object o:a) {
//		  data.add(new Object[] {o});
//	  }
	  
//	  ArrayList<Object[]> data=new ArrayList<Object[]>();
//	  data.add(new String[]{"Country","Capital","Population"});
//	  data.add(new Object[]{"India","Delhi",10000});
//	  data.add(new Object[]{"France","Paris",40000});
//	  data.add(new Object[]{"Germany","Berlin",20000});
//	  data.add(new Object[]{"England","London",30000});
	 
	  //Iterate over data and write to sheet
	   
	  int rownum = 0;
	  for (Object objects:list)//[Book [title=Clean Code, author=Robert Martin, price=42]]
	  {    					
	   System.out.println(objects);
//	   for (Object[] obj : objects) // Book [title=Head First Java, author=Kathy Serria, price=79]
//	   {
//		   Cell cell = row.createCell(cellnum++);
//		    if(obj instanceof String)
//		     cell.setCellValue((String)obj);
//		    else if(obj instanceof Double)
//		     cell.setCellValue((Double)obj);
//		    else if(obj instanceof Integer)
//		     cell.setCellValue((Integer)obj);
//	   }
	   
	  }
	  try
	  {
	   //Write the workbook in file system
	   FileOutputStream out = new FileOutputStream(new File("D://test/download/CountriesDetails.xlsx"));
	   workbook.write(out);
	   out.close();
	   System.out.println("CountriesDetails.xlsx has been created successfully");
	  } 
	  catch (Exception e) 
	  {
	   e.printStackTrace();
	  }
	  finally {
	   workbook.close();
	  }
	 }
	 
	}