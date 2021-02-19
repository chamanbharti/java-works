package math.permutation_combination;

import java.util.Scanner;
/*
 Permutations are the number of arrangements or orderings of the elements within a fixed group. Combinations on the other hand, 
 are useful when we have to find out how many groups can form from a larger number of people.

If you are forming a group from a larger group and the placement within the smaller group is important, 
then you want to use permutations.
 */
public class PermutationCombinationNumber {

	public static void main(String[] args) {
		
		int n, r;
		Scanner input = new Scanner(System.in);
		//enter numbers here
		System.out.println("Enter Value of n : ");
		n = input.nextInt();
		System.out.println("Enter Value of r : ");
		r = input.nextInt();
		
		//calculate permutaion and combination here
		System.out.println("Permutation of the numbers is : "+( fact(n) / ( fact(n-r) ) ) );
		System.out.println("\nCombination of the numbers is : "+(fact(n)/ ( fact(r) * fact(n-r) ) ) );
	}
	
	public static int fact(int no) {
		//initialize and declare objects
		int fact=1, i;
		for(i=1;i<=no;i++) {
			fact = fact * i;
		}
		
		return fact;
	}
}
