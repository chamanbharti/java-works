package com.xlsx;

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
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CellAlignment {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		try(OutputStream os = new FileOutputStream("cell_alignment2.xlsx")) {
			XSSFSheet sheet = workbook.createSheet("New Sheet");
			XSSFRow row = sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue("Javatpoint");
			
			row = sheet.createRow(5);
			cell = row.createCell(0);
			
			// Top Left alignment 
			XSSFCellStyle style = workbook.createCellStyle();
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
