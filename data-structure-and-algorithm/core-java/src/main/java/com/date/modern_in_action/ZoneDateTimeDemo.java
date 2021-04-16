package date.modern_in_action;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

	public static void main(String[] args) {
		
		
		ZoneId indiaZone = ZoneId.systemDefault();
		System.out.println(ZoneId.systemDefault());
		LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
		ZonedDateTime zdt1 = date.atStartOfDay(indiaZone);
		System.out.println(zdt1);
		
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
		ZonedDateTime zdt2 = dateTime.atZone(indiaZone);
		System.out.println(zdt2);
		
		Instant instant = Instant.now();
		ZonedDateTime zdt3 = instant.atZone(indiaZone);
		System.out.println(zdt3);
	}
}
