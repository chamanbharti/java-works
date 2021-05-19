package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class MergeTwoCell {
	
	public static void main(String[] args) {
		
		try(OutputStream os = new FileOutputStream("merge_cell.xls")){
			Workbook workbook = new HSSFWorkbook();
			Sheet sheet = workbook.createSheet("Sheet");
			Row row = sheet.createRow(1);
			Cell cell = row.createCell(1);
			cell.setCellValue("Two cells have merged");
			// Merging cells by providing cell index
			sheet.addMergedRegion(new CellRangeAddress(1,1,1,2));
			workbook.write(os);
			workbook.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

	}
}
