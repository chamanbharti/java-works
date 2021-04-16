package mathematics;

import java.util.Scanner;
/*
 * step I
 HCF/GCD/GCF
 n1 = 60
 n2 = 24
 60/24 = 12
 24/12 = 0
 GCD=12
 
 step II
 n1 = 60
 n2 = 24
 60-24=36
 36-24=12
 24-12=12
 12-12=0
 
 n1 = 60
 n2 = 24
 24=24,48,72,96,120
 60=60,120
 LCM=n1*n2/gcd/gcf
 */
public class FindLCMHCFGCD {

	public static void main(String[] args) {
		int n1,n2,x,y,gcd,lcm;
		System.out.println("Enter two positive nos");
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		x = n1;
		y = n2;
		while(n1 != n2) {
			if(n1>n2) {
				n1 = n1-n2;
			}else {
				n2 = n2-n1;
			}
		}
		gcd = n1;
		lcm = (x*y)/gcd;
		System.out.println("GCD/HCF:"+gcd);
		System.out.println("LCM:"+lcm);
		input.close();
	}
}
