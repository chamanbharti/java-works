package date.modern_in_action;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ZoneOffsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneOffset newYorkOffset = ZoneOffset.of("+05:30");
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.NOVEMBER, 05, 10, 07);
		OffsetDateTime dateTimeInNewYork = OffsetDateTime.of(dateTime, newYorkOffset);
		System.out.println(dateTimeInNewYork);
	}

}
