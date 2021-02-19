package java8.local.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		//System.out.println(date);
		//LocalTime time = LocalTime.now();
		//System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.printf("%d-%d-%d",dd,mm,yy);
	}
}
