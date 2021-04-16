package clock_angle;

import java.util.Scanner;

public class Clock2 {

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
	public static void findAngle(long h,long m) {
		
		if(h>12 || m<0) {
			System.out.println("Invalid Time: Enter the right time input");
			
			/*math formula to find angle between hour hand and minute hand is
			 * angle = (30*h+m/2)-6*m
			 * total angle of clock is 360 degree
			 * hour hand unit = 360/12=30
			 * minute hand unit=360/60=6
			 */
		}else {
			long angle = Math.abs( ( 30 * h + m / 2 ) - 6*m);
			System.out.println("The actual angle at "+h+":"+m+" o'clock is "+angle+" degree");
			
			if(angle>180) {
				angle = 360-angle;
				System.out.println("The actual angle at "+h+":"+m+" o'clock is "+angle+" degree");
			}
		}
	}
}

