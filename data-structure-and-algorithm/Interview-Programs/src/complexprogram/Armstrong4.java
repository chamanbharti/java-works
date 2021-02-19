package complexprogram;

import java.util.Scanner;
//print Armstrong numbers from 1 to 500
public class Armstrong4 {
	public static void main(String[] args) {
		int num,r,sum,temp;
		//Scanner in = new Scanner(System.in);
	   // System.out.println("Enter a number: ");
	    //num=in.nextInt();

	    for(num=1;num<=500;num++){
	    	
	    	temp=num;
	    	sum=0;
	    	while(temp!=0){
	         r=temp%10;
	         temp=temp/10;
	         sum=sum+(r*r*r);
	    }
	    if(sum==num)
	    	System.out.print(num+",");
	    
	}

}
}