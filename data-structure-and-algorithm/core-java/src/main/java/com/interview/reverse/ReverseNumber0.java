package com.interview.reverse;

public class ReverseNumber0 {

	public static void main(String[] args) {
		
		int no=121;
		int temp = no;
		int sum = 0;
		int rem = 0;
//		while(no>0) {
//			rem = no%10;
//			sum = sum * 10 + rem;
//			no = no/10;
//		}
		
//		do {
//			rem = no%10;
//			sum = sum * 10 + rem;
//			no = no/10;
//		}while(no>0);
		
		int i=no;
		for(; i!= 0; i=i/10) {
			rem = no%10;
			sum = sum*10+rem;
			
		}
		
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}
}
