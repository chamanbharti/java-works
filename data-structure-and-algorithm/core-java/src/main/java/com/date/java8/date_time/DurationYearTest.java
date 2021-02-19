package date.java8.date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;


public class DurationYearTest {

	public static void main(String[] args) {
		
		LocalDate dob = LocalDate.of(1984, 03, 15);
		LocalDate today = LocalDate.now();
		Period period = Period.between(dob, today);
		System.out.println(period);
		System.out.printf("Age is %d Years %d Months %d Days", period.getYears(),period.getMonths(),period.getDays());
		LocalDate deathDay = LocalDate.of(1984+60, 8, 28);
		Period p1 = Period.between(dob, deathDay);
		int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\nYou will be on the earth only %d Days.. Hurry up to do More important things",d);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year numer");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d Year is Leap Year",n);
		}else {
			System.out.printf("%d Year is not Leap Year",n);
		}
		sc.close();
	}

}
 