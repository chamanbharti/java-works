package complexprogram;

import java.util.Scanner;
//Using While loop
public class Armstrong2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num,r,sum,temp;
	    int min,max;

	    System.out.println("Enter the minimum range: ");
	    min=in.nextInt();

	    System.out.println("Enter the maximum range: ");
	    max=in.nextInt();

	    System.out.println("Armstrong numbers in given range are: ");
	    for(num=min;num<=max;num++){
	         temp=num;
	         sum = 0;

	         while(temp!=0){
	             r=temp%10;
	             temp=temp/10;
	             sum=sum+(r*r*r);
	         }
	         if(sum==num)
	        	 System.out.println(num);
	    }
}
	
}