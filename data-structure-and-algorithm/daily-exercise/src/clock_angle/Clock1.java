package clock_angle;

import java.util.Scanner;

public class Clock1 {

	public static void main(String[] args) {
	 long hour = 0;
	 long minute = 0;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter Hour Hand");
	 hour = input.nextLong();
	 
	 System.out.println("Enter Minute Hand");
	 minute = input.nextLong();
	 findAngle(hour,minute);
	 
	 
	}
	public static void findAngle(long hour,long minute) {
		
		//find position of hour's hand
		long h = (hour * 360) / 12 + (minute * 360) / (12*60);
		
		//find position of hour's hand
		long m = (minute * 360) / 60;
		
		//calculate the angle difference
		long angle = Math.abs(h - m);
		
		//consider shorter angle and return it
		if(angle > 180) {
			angle = 360 - angle;
		}
		
		System.out.println("Angle:"+angle);
	}
}
