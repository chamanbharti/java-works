package java8.clock;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockDemo {

	public static void main(String[] args) {
		
		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock);
		System.out.println(System.currentTimeMillis());
		long millis = clock.millis();
		System.out.println(millis);
		
		Instant instant = clock.instant();
		System.out.println(instant);
		Date legacyDate = Date.from(instant);
		System.out.println(legacyDate);
	}

}
