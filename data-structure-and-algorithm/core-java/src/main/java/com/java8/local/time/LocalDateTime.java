package java8.local.time;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1989, 8, 28);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathDay = LocalDate.of(1989+60, 02, 12);
		LocalDate today2 = LocalDate.now();
		Period p1 = Period.between(today2,deathDay);
		int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\n You will be on the earth only %d Days..Hurry up to do more important things",d);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("\n"+zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
		
	}

	
}
