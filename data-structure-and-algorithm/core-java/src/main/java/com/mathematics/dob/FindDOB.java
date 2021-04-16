package mathematics.dob;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class FindDOB {

	public static void main(String[] args) {
		
		// step 1
//		LocalDate dob = LocalDate.of(1989, 2, 12);
//		LocalDate today = LocalDate.now();
//		Period period = Period.between(dob, today);
//		System.out.println(period);
		
		LocalDateTime dob = LocalDateTime.of(2021, 01, 9, 21, 25);
		LocalDateTime today = LocalDateTime.now();
		Duration period = Duration.between(dob, today);
		System.out.println(period);
	}
}
