package com.xlsx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.model.Book;

public class GenericExcelAndCSVWriter {

	public <T> void writeExcel(List<T> listBook, String excelFilePath) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

		int rowCount = 0;
	    createHeaderRow(sheet);
	    Object[] a = listBook.toArray();
	    for (int i=0;i<a.length;i++) {
	    	Book aBook = (Book) a[i];
	    	XSSFRow row = sheet.createRow(++rowCount);
	        writeBook(aBook, row);
	    }
	 
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	        workbook.close();
	    }
	}
	
	private void writeBook(Book aBook, XSSFRow row) {
		XSSFCell cell = row.createCell(0);
	    cell.setCellValue(aBook.getTitle());
	 
	    cell = row.createCell(1);
	    cell.setCellValue(aBook.getAuthor());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(aBook.getPrice());
	}
	
	private List<Book> getListBook() {
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
	
	private static String produceCsvData(Object[] data) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		if (data.length == 0) {
			return "";
		}

		Class<?> classType = data[0].getClass();
		StringBuilder builder = new StringBuilder();

		Method[] methods = classType.getDeclaredMethods();

		for (Method m : methods) {
			if (m.getParameterTypes().length == 0) {
				if (m.getName().startsWith("get")) {
					builder.append(m.getName().substring(3)).append(',');
				} else if (m.getName().startsWith("is")) {
					builder.append(m.getName().substring(2)).append(',');
				}

			}

		}
		builder.deleteCharAt(builder.length() - 1);
		builder.append('\n');
		for (Object d : data) {
			for (Method m : methods) {
				if (m.getParameterTypes().length == 0) {
					if (m.getName().startsWith("get") || m.getName().startsWith("is")) {
						//System.out.println(m.invoke(d).toString());
						builder.append(m.invoke(d).toString()).append(',');
					}
				}
			}
			builder.append('\n');
		}
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}

	public static boolean generateCSV(Object[] data, File csvFileName) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(csvFileName);
			if (!csvFileName.exists())
				csvFileName.createNewFile();
			fw.write(produceCsvData(data));
			fw.flush();
		} catch (Exception e) {
			System.out.println("Error while generating csv from data. Error message : " + e.getMessage());
			e.printStackTrace();
			return false;
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
				}
				fw = null;
			}
		}
		return true;
	}
	public <T> void writeCSV(List<T> listBook, String csvFilePath) {
		 Object[] a = listBook.toArray();
//		 // approach I
//	     Book[] list = new Book[a.length];
//		    for (int i=0;i<a.length;i++) {
//		    	Book aBook = (Book) a[i];
//		    	list[i] = aBook;
//		    }
//		    
//		    TestFinal2.generateCSV(list, new File("D:\\products1.csv"));
//		 
//		 // approach II
//		    TestFinal2.generateCSV(a, new File("D:\\products2.csv"));
		    TestFinal2.generateCSV(a, new File(csvFilePath));
		    
		    
}
	public static void main(String[] args) throws IOException {
		
		GenericExcelAndCSVWriter excelWriter = new GenericExcelAndCSVWriter();
		 
		List<Book> listBook = excelWriter.getListBook();
		String excelFilePath = "D://test/download/NiceJavaBooks.xlsx";
		 
		excelWriter.writeExcel(listBook, excelFilePath);
		
        excelFilePath = "D://test/download/NiceJavaBooks.csv";
        excelWriter.writeCSV(listBook,excelFilePath);
		System.out.println("success");
	}
}
