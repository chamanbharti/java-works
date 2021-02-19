package array.basics;

public class OneDArray3 {
	public static void main(String[] args) {
	
		int array [] = {5,12,17,9,3};//declaration, instantiation and initialization  
		
		//passing array to method
		findMaximumNumber(array);
		
	}
	
	static void findMaximumNumber(int [] array){
		
		int max = array[0];
		for(int i=1;i<array.length;i++)//length is the property of array
		{
			if(max<array[i])//the logic for max value
				max=array[i];
		}
		System.out.print(" Maximum Number: "+max);
	}
}
