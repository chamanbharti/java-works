package com.workbook.sheet.cell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateDateCell {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		 Workbook wb = new HSSFWorkbook();  
	        CreationHelper createHelper = wb.getCreationHelper();  
	        try(OutputStream os = new FileOutputStream("st_date_cell.xls")){  
	            Sheet sheet = wb.createSheet("New Sheet");  
	            Row row     = sheet.createRow(0);  
	            Cell cell   = row.createCell(0);  
	            CellStyle cellStyle = wb.createCellStyle();  
	            cellStyle.setDataFormat(  
	                createHelper.createDataFormat().getFormat("d/m/yy h:mm"));  
	            cell = row.createCell(1);  
	            cell.setCellValue(new Date());  
	            cell.setCellStyle(cellStyle);  
	            wb.write(os);  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
