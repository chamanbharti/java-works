package com.xlsx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.model.Book;

public class GenericExcelWriterFinal2 {

	public <T> void writeExcel(List<T> listBook, String excelFilePath) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Books Details");

		
	    createHeaderRow(sheet);
	    
	    Object[] objectArray = listBook.toArray();
	    ArrayList<Object[]> data = new ArrayList<Object[]>();
	    for(Object o:objectArray) {
	    	data.add(new Object[] {o});
	    }
	    
	    int rowCount = 0;
	    for (Object[] objects : data) {
	    	XSSFRow row = sheet.createRow(++rowCount);
	        //writeBook(aBook, row);
	        
	        int cellCount = 0;
	        for (Object obj : objects)
	        {
	         XSSFCell cell = row.createCell(cellCount++);
	         if(obj instanceof String)
	          cell.setCellValue((String)obj);
	         else if(obj instanceof Double)
	          cell.setCellValue((Double)obj);
	         else if(obj instanceof Float)
	          cell.setCellValue((Float)obj);
	         else if(obj instanceof Long)
		       cell.setCellValue((Long)obj);
	         else if(obj instanceof Integer)
		       cell.setCellValue((Integer)obj);
	         else if(obj instanceof Boolean)
			   cell.setCellValue((Boolean)obj);
	         else if(obj instanceof Short)
			   cell.setCellValue((Short)obj);
	         else if(obj instanceof Byte)
			   cell.setCellValue((Byte)obj);
	         else if(obj instanceof Character)
			   cell.setCellValue((Character)obj);
	        }
	        
	    }
	 
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	        workbook.close();
	        System.out.println("xlsx has been created successfully");
	    }
	}
	/*
	private void writeBook(Book aBook, XSSFRow row) {
		XSSFCell cell = row.createCell(0);
	    cell.setCellValue(aBook.getTitle());
	 
	    cell = row.createCell(1);
	    cell.setCellValue(aBook.getAuthor());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(aBook.getPrice());
	}
	*/
	
	private void writeBook(Book aBook, XSSFRow row) {
		XSSFCell cell = row.createCell(0);
	    cell.setCellValue(aBook.getTitle());
	 
	    cell = row.createCell(1);
	    cell.setCellValue(aBook.getAuthor());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(aBook.getPrice());
	}
	
	public List<Book> getListBook() {
		Book book1 = new Book("Head First Java", "Kathy Serria", "79");
		Book book2 = new Book("Effective Java", "Joshua Bloch", "36");
		Book book3 = new Book("Clean Code", "Robert Martin", "42");
		Book book4 = new Book("Thinking in Java", "Bruce Eckel", "35");
	 
	    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
	 
	    return listBook;
	}
	
	
	private void createHeaderRow(XSSFSheet sheet) {
		 
		XSSFCellStyle cellStyle = sheet.getWorkbook().createCellStyle();
		XSSFFont font = sheet.getWorkbook().createFont();
	    font.setBold(true);
	    font.setFontHeightInPoints((short) 16);
	    cellStyle.setFont(font);
	 
	    XSSFRow row = sheet.createRow(0);
	    XSSFCell cell = row.createCell(0);
	 
	    cell.setCellStyle(cellStyle);
	    cell.setCellValue("Title");
	 
	    cell = row.createCell(1);
	    cell.setCellStyle(cellStyle);
	    cell.setCellValue("Author");
	 
	    cell = row.createCell(2);
	    cell.setCellStyle(cellStyle);
	    cell.setCellValue("Price");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		GenericExcelWriterFinal2 excelWriter = new GenericExcelWriterFinal2();
		 
		List<Book> listBook = excelWriter.getListBook();
		String excelFilePath = "D://test/download/NiceJavaBooks0001.xlsx";
		 
		excelWriter.writeExcel(listBook, excelFilePath);
		System.out.println("success");
	}
}
