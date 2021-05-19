package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class CellAlignment {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		try(OutputStream os = new FileOutputStream("cell_alignment.xls")) {
			Sheet sheet = workbook.createSheet("New Sheet");
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("Javatpoint");
			
			row = sheet.createRow(5);
			cell = row.createCell(0);
			
			// Top Left alignment 
			HSSFCellStyle style = (HSSFCellStyle) workbook.createCellStyle();
			sheet.setColumnWidth(0, 8000);
			cell.setCellValue("Top Left");
			cell.setCellStyle(style);
			
			row = sheet.createRow(6);
			cell = row.createCell(1);
			row.setHeight((short) 800);
			
			workbook.write(os);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
