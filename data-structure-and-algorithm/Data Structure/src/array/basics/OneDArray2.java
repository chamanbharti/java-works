package array.basics;

public class OneDArray2 {
	public static void main(String[] args) {
	
		int array [] = {5,12,17,9,3};//declaration, instantiation and initialization  
		
		//passing array to method
		findMinimumNumber(array);
		
	}
	
	static void findMinimumNumber(int [] array){
		int min = array[0];
		for(int i=1;i<array.length;i++)//length is the property of array
		{
			if(min>array[i])
				min=array[i];
		}
		System.out.print(" Minimum Number: "+min);
	}
}
