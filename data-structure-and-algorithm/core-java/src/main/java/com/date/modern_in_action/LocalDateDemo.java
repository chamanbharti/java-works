package date.modern_in_action;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDateDemo {

	public static void main(String[] args) {

		Date date = new Date(117,9,21);
		System.out.println("Date:"+date);
		LocalDate localDate = LocalDate.now();
		System.out.println("CurrentDate:"+localDate);
		localDate = LocalDate.of(2017, 9, 21);
		System.out.println("LocalDate:"+localDate);
		int year = localDate.getYear();
		System.out.println("Year:"+year);
		Month month = localDate.getMonth();
		System.out.println("Month:"+month);
		int monthValue = localDate.getMonthValue();
		System.out.println("monthValue:"+monthValue);
		int day = localDate.getDayOfMonth();
		System.out.println("Day:"+day);
		DayOfWeek dow = localDate.getDayOfWeek();
		System.out.println("DayOfWeek:"+dow);
		int len = localDate.lengthOfMonth();
		System.out.println("Length:"+len);
		boolean leap = localDate.isLeapYear();
		System.out.println("Leap Year:"+leap);
		
		int year1 = localDate.get(ChronoField.YEAR);
		System.out.println("Year:"+year1);
		int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("Month:"+month1);
		int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
		System.out.println("Day:"+day1);
		
		System.out.println("String To Date");
		LocalDate stringToDate = LocalDate.parse("2020-11-04");
		System.out.println(stringToDate);
	}

}
