package com.xlsx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenericWayToGenerateExcel {

	 public static void main(String[] args) throws IOException {
	  writeFileUsingPOI();
	 }
	 
	 public static void writeFileUsingPOI() throws IOException 
	 {
	  //create blank workbook
	  XSSFWorkbook workbook = new XSSFWorkbook(); 
	 
	  //Create a blank sheet
	  XSSFSheet sheet = workbook.createSheet("Country");
	 
	  ArrayList<Object[]> data=new ArrayList<Object[]>();
	  data.add(new String[]{"Country","Capital","Population"});
	  data.add(new Object[]{"India","Delhi",10000});
	  data.add(new Object[]{"France","Paris",40000});
	  data.add(new Object[]{"Germany","Berlin",20000});
	  data.add(new Object[]{"England","London",30000});
//	 data:[[Country, Capital, Population], [India, Delhi, 10000], [France, Paris, 40000], [Germany, Berlin, 20000], [England, London, 30000], null, null, null, null, null]
	  //Iterate over data and write to sheet
	  int rownum = 0;
	  // countries:[Country, Capital, Population]
	  for (Object[] countries : data)
	  {
	   Row row = sheet.createRow(rownum++);
	 
	   int cellnum = 0;
	   // obj:Country
	   for (Object obj : countries)
	   {
	    Cell cell = row.createCell(cellnum++);
	    if(obj instanceof String)
	     cell.setCellValue((String)obj);
	    else if(obj instanceof Double)
	     cell.setCellValue((Double)obj);
	    else if(obj instanceof Integer)
	     cell.setCellValue((Integer)obj);
	   }
	  }
	  try
	  {
	   //Write the workbook in file system
	   FileOutputStream out = new FileOutputStream(new File("D://test/download/CountriesDetails.xlsx"));
	   workbook.write(out);
	   out.close();
	   System.out.println("CountriesDetails.xlsx has been created successfully");
	  } 
	  catch (Exception e) 
	  {
	   e.printStackTrace();
	  }
	  finally {
	   workbook.close();
	  }
	 }
	 
	}