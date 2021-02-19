package odd_even;
import java.util.*;
public class EvenOdd1{
	static int n;
	public static void main(String args[])
	{
		EvenOdd1 obj = new EvenOdd1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		
		System.out.println("Using Modulo Operator");
		obj.byModulo(n);
		
		System.out.println("Using Mathematic logic");
		obj.byMathematicLogic(n);
		
		System.out.println("Using Division Operator ( / )");
		obj.byDivisionOperator(n);
		
		System.out.println("Using Bitwise AND Operator (&)");
		obj.byBitwiseAndOperator(n);
		
		System.out.println("Using Left shift and Right shift operators (<< , >>)");
		obj.LeftShiftRightShiftOperator(n);
		
		System.out.println("find from 1 to 10");
		int min=1;
		int max=10;
		obj.print(min,max);
		
	}
	private void byModulo(int n) {
		//Using Modulo Operator ( % ) 
		if(n%2 == 0)// 5/2=1
			System.out.println("Given Number "+n+" is Even");
		else
			System.out.println("Given Number "+n+" is odd");
	}
	private void byMathematicLogic(int no) {
		//without using % or / operator 
				while(no >= 2)
				{
					no = no-2;
				}
				if(no==0)
					System.out.println("Given Number "+n+" is Even");
				else
					System.out.println("Given Number "+n+" is odd");
	}
	private void byDivisionOperator(int n) {
		//Using Division Operator ( / ) 
		if(n/2*2 == n)
			System.out.println("Given Number "+n+" is Even");
		else
			System.out.println("Given Number "+n+" is odd");
	}
	private void byBitwiseAndOperator(int n) {
		//Using Bitwise AND Operator (&)
		//int result = n & 1;
		//if(result == 0)
		if((n & 1) == 0)
			System.out.println("Given Number "+n+" is Even");
		else
			System.out.println("Given Number "+n+" is odd");
	}
	private void LeftShiftRightShiftOperator(int n) {
		//Using Left shift and Right shift operators (<< , >>)
		int result = (n >> 1) << 1; // right by 1 bit and then left shift by 1 bit
		 if(result == n)
		 //if((n >> 1) == n)
			System.out.println("Given Number "+n+" is Even");
		else
			System.out.println("Given Number "+n+" is odd");
	}
	
	private void print(int min,int max) {
		for(int no=min;no<=max;no++) {
			if(no%2==0) {
				System.out.println(no+" is even");
			}else {
				System.out.println(no+" is odd");
			}
				
		}
	}
	
}