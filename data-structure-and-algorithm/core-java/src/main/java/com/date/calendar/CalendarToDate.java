package date.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarToDate {

	public static void main(String[] args) {
		//Calendar Object to Date Object
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		Date date = cal.getTime();
		System.out.println(date);
		
		//Date Object to Calendar Object
		 Date date2 =new Date(1515660045);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		System.out.println(cal2.getTime());
		
	}

}
