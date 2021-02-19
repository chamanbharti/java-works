package complexprogram;

import java.util.Scanner;
//Using While loop
public class Armstrong {
	public static void main(String[] args) {
		int num,r,sum=0,temp;
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    num=in.nextInt();

	    temp=num;
	    while(num!=0){
	         r=num%10;
	         num=num/10;
	         sum=sum+(r*r*r);
	    }
	    if(sum==temp)
	    	System.out.println("Number:"+temp+" is Armstrong");
	    else
	    	System.out.println("Number:"+temp+" is not Armstrong");
	}

}
