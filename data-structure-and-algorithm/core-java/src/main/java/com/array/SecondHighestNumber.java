package array;
/**
 Que-1: Print numbers from 1 to 10 in the following manner:
1
2 3
4 5 6
7 8 9 10


Que-2: Get the middle characters of a string, if string is odd then return middle 3 characters, if it is even then return middle 2 characters
e.g. program = ogr
string = ri


Que-3: Write a program to find the different elements from two arrays.
e.g. array1[] = {2, 5, 8, 9} array2[] = {5, 6, 7, 8, 10}
Here different elements are {2, 6, 7, 9, 10}



Que-4: Write a program to find the second highest number in a single dimension array.


 */
public class SecondHighestNumber{
	 public static void main(String[] args){
	                 //0  1   2
//		int[] a = {10,20,40};
//		int firstHihest = a[0];
//		int secondHihest = a[0];
//		int count = 0;
//		for(int i=0;i<a.length;i++){
//		   if(firstHihest<a[i]){
//			   firstHihest = a[i];
//	           }
//		}
//		for(int i=0;i<a.length;i++){
//			   if(firstHihest>a[i]){
//				   secondHihest = a[i];
//				   count++;
//		        }
//			}
//
//		System.out.println("First Highest number is:"+firstHihest);
//		System.out.println("Second Highest number is:"+secondHihest);
		 
		 int k=1;
		 for (int i = 1; i <= 4; i++) {
			 for (int j = 1; j < i+1; j++) {
				System.out.print(k +" ");
				k++;
			}
			 System.out.println();
		}
		 
	  }
	}