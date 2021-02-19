package date.java8.date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
public class ZoneIdZoneDateTime {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		
		ZoneId ac = ZoneId.of("Asia/Calcutta");
		ZonedDateTime zdt = ZonedDateTime.now(ac);
		System.out.println(zdt);
		
//		ZoneId zone2 = ZoneId.of("America/Los_Angeles");
//		System.out.println(zone2);
//		ZoneId la2 = ZoneId.of("America/Los_Angeles");
//		ZonedDateTime zdt2 = ZonedDateTime.now(la2);
//		System.out.println(zdt2);
		
		ZoneId zone2 = ZoneId.of("America/Los_Angeles");
		System.out.println(zone2);
		ZoneId la2 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt2 = ZonedDateTime.now(la2);
		System.out.println(zdt2);
	}

}
