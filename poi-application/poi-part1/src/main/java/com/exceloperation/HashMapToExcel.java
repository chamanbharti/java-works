package com.exceloperation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMapToExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student data");
		
		Map<String, String> data = new HashMap<>();
		data.put("101", "John");
		data.put("102", "Smith");
		data.put("103", "Scott");
		data.put("104", "Kim");
		data.put("105", "Mary");
		
		int rowNo = 0;
		for(Map.Entry<String, String> entry:data.entrySet()) {
			XSSFRow row = sheet.createRow(rowNo++);
			
			row.createCell(0).setCellValue(entry.getKey());
			row.createCell(1).setCellValue(entry.getValue());
		}
		
		FileOutputStream fos = new FileOutputStream(".\\datafiles\\student2.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("excell written succesfully");
		
	}
}
