package com.workbook.sheet.cell;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class dd {
	  public static void main(String args[])throws Exception { 
	      File file = new File("tt.xlsx");
	      FileInputStream fIP = new FileInputStream(file);
	      
	      //Get the workbook instance for XLSX file 
	      XSSFWorkbook workbook = new XSSFWorkbook(fIP);
	      
	      if(file.isFile() && file.exists()) {
	         System.out.println("openworkbook.xlsx file open successfully.");
	      } else {
	         System.out.println("Error to open openworkbook.xlsx file.");
	      }
	   }   
}
