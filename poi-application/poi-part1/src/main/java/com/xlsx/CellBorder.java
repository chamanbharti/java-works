package com.xlsx;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellBorder {
	public static void main(String[] args) {
			XSSFWorkbook workbook = new XSSFWorkbook();
		
			XSSFSheet sheet = workbook.createSheet("Sheet");
			XSSFRow row = sheet.createRow(1);
			XSSFCell cell = row.createCell(1);
			cell.setCellValue(101);
			
			// Styling border of cell. 
			
			XSSFCellStyle style = workbook.createCellStyle();
			style.setBorderBottom(BorderStyle.THICK);
			style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderRight(BorderStyle.THICK);
			style.setRightBorderColor(IndexedColors.RED.getIndex());
			style.setBorderTop(BorderStyle.MEDIUM_DASHED);
			style.setTopBorderColor(IndexedColors.RED.getIndex());
			
			cell.setCellStyle(style);
			try(OutputStream os = new FileOutputStream("border2.xlsx")) {
				workbook.write(os);
				workbook.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
