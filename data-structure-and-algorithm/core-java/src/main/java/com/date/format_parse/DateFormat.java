package date.format_parse;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		// Get Current Date and Time: java.time.format.DateTimeFormatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		// Get Current Date and Time: java.text.SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss a");
		Date date = new Date();
		System.out.println(sdf.format(date));
		
		// Get Current Date: java.time.LocalDate
		System.out.println(LocalDate.now());
		
		// Get Current Time: java.time.LocalTime
		System.out.println(LocalTime.now());
		
		// Get Current Date & Time: java.time.LocalDateTime
		System.out.println(LocalDateTime.now());  
		
		// Get Current Date & Time: java.time.Clock
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(Clock.system(zoneId));// SystemClock[Asia/Calcutta]
		System.out.println(Clock.systemDefaultZone());// SystemClock[Asia/Calcutta]
		System.out.println(Clock.systemUTC());// SystemClock[Z]
		System.out.println(Clock.systemUTC().instant());
		
		// Get Current Date & Time: java.util.Date
		// 1st way
		java.util.Date d = new Date();
		System.out.println(d);
		// 2nd way
		long millis = System.currentTimeMillis();
		java.util.Date dd = new Date(millis);
		System.out.println(dd);
		
		// Get Current Date: java.sql.Date
		long millis2=System.currentTimeMillis();  
		java.sql.Date date2=new java.sql.Date(millis2);  
		System.out.println(date2); 
		
		// Get Current Date & Time: java.util.Calendar
		Date date3 = java.util.Calendar.getInstance().getTime();  
		System.out.println(date3);  
	}

}
