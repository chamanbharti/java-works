package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class CellBorder {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		
			Sheet sheet = workbook.createSheet("Sheet");
			Row row = sheet.createRow(1);
			Cell cell = row.createCell(1);
			cell.setCellValue(101);
			
			// Styling border of cell. 
			CellStyle style = workbook.createCellStyle();
			style.setBorderBottom(BorderStyle.THICK);
			style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
			style.setBorderRight(BorderStyle.THICK);
			style.setRightBorderColor(IndexedColors.RED.getIndex());
			style.setBorderTop(BorderStyle.MEDIUM_DASHED);
			style.setTopBorderColor(IndexedColors.RED.getIndex());
			
			cell.setCellStyle(style);
			try(OutputStream os = new FileOutputStream("border.xls")) {
				workbook.write(os);
				workbook.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
