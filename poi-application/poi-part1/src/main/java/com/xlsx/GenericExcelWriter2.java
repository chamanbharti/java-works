package com.xlsx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.model.Book;

public class GenericExcelWriter2 {

	public void writeExcel(List<Book> listBook, String excelFilePath) throws IOException {
	    Workbook workbook = new HSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
	    int rowCount = 0;
	    createHeaderRow(sheet);
	    for (Book aBook : listBook) {
	        Row row = sheet.createRow(++rowCount);
	        writeBook(aBook, row);
	    }
	 
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	    }
	}
	public <T> void writeExcel2(List<T> listBook, String excelFilePath) throws IOException {
	    Workbook workbook = new HSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
//	    sheet.setColumnWidth(3, 25 * 256);
//	    sheet.autoSizeColumn(1);
	   
	    for (int i = 0; i < listBook.size(); i++) {
	        sheet.autoSizeColumn(i);
	    }
	    int rowCount = 0;
	    createHeaderRow(sheet);
	    Object[] a = listBook.toArray();
//	    for (Book aBook : listBook) {
	    for (int i=0;i<a.length;i++) {
	    	Book aBook = (Book) a[i];
	        Row row = sheet.createRow(++rowCount);
	        writeBook(aBook, row);
	    }
	 
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	        workbook.close();
	    }
	}
	public <T> void makeExcel2(List<T> T,String excelFilePath) {
		Object[] a = T.toArray();
		for(int i=0;i<a.length;i++) {
//			Book o = (Book) T.get(i);
			Book o = (Book) a[i];
			
			
			String title = o.getTitle();
			String author = o.getAuthor();
			String price = String.valueOf(o.getPrice());
			System.out.println(o);
		}
		
		/*
		 T[] array = (T[]) new Object[T.size()]; //using <T> T[] toArray(T[] a);
		//Object array[] = List.toArray(new Object[T.size()]); // using Object[] toArray();
	        for (int i = 0; i < T.size(); i++) {
	            array[i] = T.get(i);
	        }
	        //return array;
	        for(int i=0;i<array.length;i++) {
	        	System.out.println(array[i]);
	        }
		
		*/
	}
	
	private void writeBook(Book aBook, Row row) {
	    Cell cell = row.createCell(1);
	    cell.setCellValue(aBook.getTitle());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(aBook.getAuthor());
	 
	    cell = row.createCell(3);
	    cell.setCellValue(aBook.getPrice());
	}
	
	private List<Book> getListBook() {
	    Book book1 = new Book("Head First Java", "Kathy Serria", 79);
	    Book book2 = new Book("Effective Java", "Joshua Bloch", 36);
	    Book book3 = new Book("Clean Code", "Robert Martin", 42);
	    Book book4 = new Book("Thinking in Java", "Bruce Eckel", 35);
	 
	    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
	 
	    return listBook;
	}
	
	
	
	public void makeExcel(List<Book> T) {
		
		for(int i=0;i<T.size();i++) {
			Object o = T.get(i);
			
			String title = T.get(i).getTitle();
			String author = T.get(i).getAuthor();
			String price = String.valueOf(T.get(i).getPrice());
			System.out.println(o);
		}
		
		
		
	}
	
	private void createHeaderRow(Sheet sheet) {
		 
	    CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
	    Font font = sheet.getWorkbook().createFont();
	    font.setBold(true);
	    font.setFontHeightInPoints((short) 16);
	    cellStyle.setFont(font);
	 
	    Row row = sheet.createRow(0);
	    Cell cellTitle = row.createCell(1);
	 
	    cellTitle.setCellStyle(cellStyle);
	    cellTitle.setCellValue("Title");
	 
	    Cell cellAuthor = row.createCell(2);
	    cellAuthor.setCellStyle(cellStyle);
	    cellAuthor.setCellValue("Author");
	 
	    Cell cellPrice = row.createCell(3);
	    cellPrice.setCellStyle(cellStyle);
	    cellPrice.setCellValue("Price");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		GenericExcelWriter2 excelWriter = new GenericExcelWriter2();
		 
		List<Book> listBook = excelWriter.getListBook();
		String excelFilePath = "NiceJavaBooks25.xls";
		 
//		excelWriter.writeExcel(listBook, excelFilePath);
		excelWriter.writeExcel2(listBook, excelFilePath);
		excelWriter.makeExcel2(listBook, excelFilePath);
		System.out.println("success");
	}
}
