package com.exceloperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingPasswordprotectedExcel {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileInputStream fis = new FileInputStream(".\\datafiles\\customers.xlsx");
		String password = "test123";
		
		// XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 Workbook workbook = WorkbookFactory.create(fis,password);
		 XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);
		 
		// XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis,password);
 	   // XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		System.out.println(rows);//5 started from 0
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(cols);// 3 started from 1
		
		/*
		// read data from sheet for loop
		for(int r=0;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				case FORMULA: System.out.print(cell.getNumericCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		*/
		
		// read data from sheet using Iterator
		Iterator<Row> iterator = sheet.iterator();
		while(iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				case FORMULA: System.out.print(cell.getNumericCellValue()); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
		workbook.close();
		fis.close();
	}
}
