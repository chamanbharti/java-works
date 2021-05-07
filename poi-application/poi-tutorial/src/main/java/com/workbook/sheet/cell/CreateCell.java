package com.workbook.sheet.cell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateCell {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook workbook = new HSSFWorkbook();
		
		try(OutputStream output = new FileOutputStream("st_cell.xls")) {
			
			 Sheet sheet = workbook.createSheet();
			 Row row = sheet.createRow(2);
			 Cell cell = row.createCell(5);
			 cell.setCellValue("Chaman");
			 workbook.write(output);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
