package date.calendar;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String args[]) 
    { 
       // create a calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
      // print current date
        System.out.println("The current date is : " + cal.getTime());
     // add 20 days to the calendar
        cal.add(Calendar.DATE, 35);
        System.out.println("35 days later: " + cal.getTime());
    } 

}
