package array;

public class InitArray2 
{
	public static void main(String[] args) 
	{
		int[] array={32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		//array=new int[10];
		System.out.printf("%s%8s\n","Index","Value");
		
		for(int counter=0;counter<array.length;counter++)
		{
			System.out.printf("%5d%8d\n",counter,array[counter]);
		}
	}
}
