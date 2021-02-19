package date.modern_in_action;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime localTime1 = LocalTime.now();
		System.out.println("CurrentTime:"+localTime1);
		LocalTime localTime = LocalTime.of(13, 45, 20);
		System.out.println("LocalTime:"+localTime);
		int hour = localTime.getHour();
		System.out.println("hour:"+hour);
		int minute = localTime.getMinute();
		System.out.println("minute:"+minute);
		int nano = localTime.getNano();
		System.out.println("nano:"+nano);
		int second = localTime.getSecond();
		System.out.println("second:"+second);
		int toSecondOfDay = localTime.toSecondOfDay();
		System.out.println("toSecondOfDay:"+toSecondOfDay);
		
		int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);
		System.out.println("hour1:"+hour1);
		int minute1 = localTime.get(ChronoField.MINUTE_OF_DAY);
		System.out.println("minute1:"+minute1);
		long nano1 = localTime.getLong(ChronoField.NANO_OF_DAY);
		System.out.println("nano1:"+nano1);
		int nano2 = localTime.get(ChronoField.NANO_OF_SECOND);
		System.out.println("nano2:"+nano2);
		int second1 = localTime.get(ChronoField.SECOND_OF_DAY);
		System.out.println("second1:"+second1);
		int second2 = localTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("second2:"+second2);
		
		System.out.println("String To Time");
		LocalTime time = LocalTime.parse("13:90:20");
		System.out.println(time);
		
	}

}
