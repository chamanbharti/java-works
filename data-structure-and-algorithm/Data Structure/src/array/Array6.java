package array;

public class Array6 {

	public static void main(String[] args) {
		
		int a [] = {50,90,45,54,12,21,32,23};//size=8
		//according to docs
		//Thrown to indicate that an array has been accessed with an illegal index. 
		//The index is either negative or greater than or equal to the size of the array.
		
		//System.out.println(a[-1]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
		//System.out.println(a[9]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
		System.out.println(a[8]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
		
		for(int i=0;i<a.length;i++) {//it is fine
		//for(int i=0;i<=a.length;i++) {//50 90 45 54 12 21 32 23 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
			System.out.print(a[i]+" ");
			System.out.print(i+" ");//0 1 2 3 4 5 6 7 
		}
		
	}
}
