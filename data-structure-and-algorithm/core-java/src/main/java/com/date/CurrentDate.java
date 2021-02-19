package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDate {

public static void main(String[] args) {
		
	
		// Java Date Format
		// Formatting means Date to String
		Date currentDate = new Date();
		System.out.println("Current Date:"+currentDate);
		String dateToStr = DateFormat.getInstance().format(currentDate);
		System.out.println("Date Format using getInstance(): "+dateToStr); 
		
		dateToStr = DateFormat.getDateInstance().format(currentDate);  
	    System.out.println("Date Format using getDateInstance(): "+dateToStr);  
	    
	    dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr); 
		
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
        
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
        
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
        
        // parsing means String to Date
//        Date parsableDate;
//		try {
//			parsableDate = DateFormat.getDateInstance().parse("31/03/2015");
//			 System.out.println("Date is: "+parsableDate);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Java SimpleDateFormat");
		// Date to String
		 Date dateToString = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(dateToString);  
	    System.out.println(strDate);  
		
	 // String to Date
	    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");  
	    try {  
	        Date date = formatter2.parse("31/03/2015");  
	        System.out.println("Date is: "+date);  
	    } catch (ParseException e) {e.printStackTrace();}  
		
		// Get Current Date and Time: java.time.format.DateTimeFormatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		// Get Current Date and Time: java.text.SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss a");
		Date date = new Date();
		System.out.println(sdf.format(date));
		
	}

}
