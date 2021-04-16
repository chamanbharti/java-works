package array;

public class OneDArray 
{
  public static void main(String [] args)
  {
	  
	  int[] anArray; //declare an array of integers
	  anArray=new int[10];//create an array of integers
	  
	  //assign a value to each array element and print
	  //for(int i=0;i<anArray.length;i++)
	for(int i=1;i<10;i++)
	  {
		  anArray[i]=i;
		  System.out.print(anArray[i]+" ");
		  //System.out.println();
	  }
	  System.out.println();
  }
}
