package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class CellColor {

	public static void main(String[] args) {
			Workbook workbook = new HSSFWorkbook();
		
			Sheet sheet = workbook.createSheet("Sheet");
			Row row = sheet.createRow(1);
			
			CellStyle style = workbook.createCellStyle();
			// Setting Background color  
			style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
			style.setFillPattern(FillPatternType.BIG_SPOTS);  
			
			Cell cell = row.createCell(1);
			cell.setCellValue("Javatpoint");  
            cell.setCellStyle(style); 
            
            // Setting Foreground Color  
            style = workbook.createCellStyle();  
            style.setFillForegroundColor(IndexedColors.BLUE.getIndex());  
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
            cell = row.createCell(2);  
            cell.setCellValue("A Technical Portal");  
            cell.setCellStyle(style);  
            
			try(OutputStream os = new FileOutputStream("cell_color.xls")) {
				workbook.write(os);
				workbook.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
