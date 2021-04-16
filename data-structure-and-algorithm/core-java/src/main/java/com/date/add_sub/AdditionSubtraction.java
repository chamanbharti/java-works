package date.add_sub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdditionSubtraction {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println("Today's Date:"+dateFormat.format(date));
		System.out.println("*****************");
		System.out.println("Add 3 days to current date:"+addSubtractDate(3));
		System.out.println("Subtract 3 days to current date:"+addSubtractDate(-3));
		
		System.out.println("Add 3 month to current date:"+addSubtractMonth(3));
		System.out.println("Subtract 3 month to current date:"+addSubtractMonth(-3));
		
		System.out.println("Add 3 Year to current date:"+addSubtractYear(3));
		System.out.println("Subtract 3 Year to current date:"+addSubtractYear(-3));
	}
	public static String addSubtractDate(int n) {
		DateFormat dateFormate = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, n);
		String result = dateFormate.format(cal.getTime());
		return result;
	}
	
	public static String addSubtractMonth(int n) {
		DateFormat dateFormate = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println("Date:"+Calendar.DAY_OF_MONTH);
		cal.add(Calendar.MONTH, n);
		String result = dateFormate.format(cal.getTime());
		return result;
	}
	
	public static String addSubtractYear(int n) {
		DateFormat dateFormate = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, n);
		String result = dateFormate.format(cal.getTime());
		return result;
	}

}
