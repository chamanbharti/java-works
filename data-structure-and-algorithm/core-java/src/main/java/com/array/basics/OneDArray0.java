package array.basics;

public class OneDArray0 {
	public static void main(String[] args) {
	
		//1-D array
		int array[];//declaration
		array = new int[5];//instantiation
		
		//int array [] = new int[5];//declaration and instantiation  
		
		//initialization
		array[0] = 5;
		array[1] = 12;
		array[2] = 17;
		array[3] = 9;
		array[4] = 3;
		
		//print array's element
		for(int i=0;i<array.length;i++)//length is the property of array
		{
			System.out.print(array[i]+" ");
		}
	}
}
//https://www.tutorialspoint.com/data_structures_algorithms/array_data_structure.htm
//https://www.geeksforgeeks.org/data-structures/