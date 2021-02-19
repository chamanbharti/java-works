package mathematics;

import java.util.Scanner;

/**
 * Psudo code
 * 
 * fib(n)
 * if n is less than 1
 *     return error message
 * else if n is equal to 1 or 2
 * 		  return n-1
 * else
 * 		return fib(n-1) + fib(n-2)
 *
 */
public class FibonacciRecursion {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input");
		int n = input.nextInt();
		fib(n);
		System.out.println("Fibonacci Series:");
		
		
	}
	static int fib(int n) throws Exception {
		if(n < 1) {
			throw new Exception("Negative number is not part of fibonacci series");
		}
		else if(n == 1 || n == 2) {
			return n-1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}

}
