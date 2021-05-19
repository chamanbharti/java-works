package com.xlsx;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenericExcelWriter {
	public static void main(String[] args) {
		
		 XSSFWorkbook workbook = new XSSFWorkbook();
	     XSSFSheet sheet = workbook.createSheet("Java Books");
	     Object[][] bookData = {
	                {"Head First Java", "Kathy Serria", 79},
	                {"Effective Java", "Joshua Bloch", 36},
	                {"Clean Code", "Robert martin", 42},
	                {"Thinking in Java", "Bruce Eckel", 35},
	        };
	     int rowCount = 0;
	     for(Object[] abook:bookData) {
	    	 Row row = sheet.createRow(++rowCount);
	    	 int columnCount = 0;
	    	 for(Object field: abook) {
	    		 Cell cell = row.createCell(++columnCount);
	    		 if(field instanceof String) {
	    			 cell.setCellValue((String)field);
	    		 }else if(field instanceof Integer) {
	    			 cell.setCellValue((Integer)field);
	    		 }
	    	 }
	     }
	     
	     try(FileOutputStream output = new FileOutputStream("javaBooks.xlsx")){
	    	 workbook.write(output);
	    	 workbook.close();
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }
	}
}
