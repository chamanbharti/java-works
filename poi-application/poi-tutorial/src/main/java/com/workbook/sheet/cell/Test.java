package com.workbook.sheet.cell;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;  

public class Test {
	public static void main(String[] args) {  
        try (OutputStream fileOut = new FileOutputStream("hello.xls")) {  
            Workbook wb = new HSSFWorkbook();  
            Sheet sheet = wb.createSheet("Sheet");  
            // Creating Header  
            Header header = sheet.getHeader();  
            header.setCenter("Center Header");  
            header.setLeft  ("Left Header");  
            header.setRight ("Right align Header");  
            // Creating Row  
            Row row = sheet.createRow(4); // Creating a row  
            Cell cell = row.createCell(1); // Creating a cell  
            cell.setCellValue("Hello, Javatpoint!");  
                wb.write(fileOut);  
        }catch(Exception e) {  
            System.out.println(e.getMessage());  
        }  
    }   
}
