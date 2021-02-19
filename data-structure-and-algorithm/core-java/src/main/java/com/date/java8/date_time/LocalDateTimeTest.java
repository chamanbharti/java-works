package date.java8.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		/*
		LocalDate date = LocalDate.now();
		System.out.println(date);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
		*/
		
		
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.printf("Date:%d-%d-%d",dd,mm,yy);
		
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("\nTime:%d:%d:%d:%d",h,m,s,n);
		
		/*
		LocalDateTime dt = LocalDateTime.of(1995,05,28,12,45);
		System.out.println(dt);
		System.out.println("After 6 months:"+dt.plusMonths(6));
		System.out.println("Before 6 months:"+dt.minusMonths(6));
	   */
	}

}
