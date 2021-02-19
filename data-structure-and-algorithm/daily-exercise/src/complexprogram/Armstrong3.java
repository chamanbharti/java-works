package complexprogram;

import java.util.Scanner;
//Using For loop
public class Armstrong3 {
	public static void main(String[] args) {
		int num,r,sum=0,temp;
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    num=in.nextInt();

	    for(temp=num;num!=0;num=num/10){
	         r=num%10;
	         sum=sum+(r*r*r);
	    }
	    if(sum==temp)
	    	System.out.println("Number:"+temp+" is Armstrong");
	    else
	    	System.out.println("Number:"+temp+" is not Armstrong");
	}

}
