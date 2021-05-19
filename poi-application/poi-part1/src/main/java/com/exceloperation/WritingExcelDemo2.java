package com.exceloperation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo2 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		/*
		 Object empdata[][] = {
				{"EmpID","Name","Job"},
				{101,"David","Engineer"},
				{102,"Smith","Manager"},
				{103,"Scott","Analyst"}
		};
		 */
		List<Object[]>empdata = new ArrayList<>();
		empdata.add(new Object[]{"EmpID","Name","Job"});
		empdata.add(new Object[]{101,"David","Engineer"});
		empdata.add(new Object[]{102,"Smith","Manager"});
		empdata.add(new Object[]{103,"Scott","Analyst"});
		
		// using for..each loop
		int rowCount = 0;
		for(Object emp[]:empdata) {
			
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount = 0;
			
			for(Object value:emp) {
				
				XSSFCell cell = row.createCell(columnCount++);
				
				if(value instanceof String) {
					cell.setCellValue((String) value);
				}
				if(value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
				if(value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
			}
		}
		String filePath = ".\\datafiles\\emp_info3.xlsx";
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		
		workbook.write(fileOutputStream);
		fileOutputStream.close();
		System.out.println("emp_info xlsx file is written successfully");
	}
}
