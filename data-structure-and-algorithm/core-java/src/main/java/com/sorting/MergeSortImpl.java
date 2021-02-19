package sorting;
import java.io.*;
import java.util.Scanner;
public class MergeSortImpl 
{

	static void MergeSort(int array[],int left,int right)
	{
		int mid=(left+right)/2;
		/* We have to sort only when left<right because when left=right it is anyhow sorted*/
		if(left<right)
		{
			//Sort the left part
			MergeSort(array,left,mid);
			//Sort the right part
			MergeSort(array,mid+1,right);
			//Merge The two sorted parts
			Merge(array,left,mid,right);
		}
	}

/* Merge functions merges the two sorted parts. Sorted parts will be from [left, mid] and [mid+1, right].
 */
 static void Merge(int array[],int left,int mid,int right)
{
	
	//We need a temporary array to store the new  sorted part
	int tempArray[]=new int[right-left+1];
	int pos=0,lpos=left,rpos=mid+1;
	while(lpos<=mid && rpos<=right)
	{
		if(array[lpos]<array[rpos])
		{
			tempArray[pos++]=array[lpos++];
		}
		else
		{
			tempArray[pos++]=array[rpos++];
		}
	}
	
	while(lpos<=mid)
		tempArray[pos++]=array[lpos++];
	while(rpos<=right)
		tempArray[pos++]=array[rpos++];
	int iter;
    /* Copy back the sorted array to the original array */
    for(iter = 0;iter < pos; iter++)
    {
            array[iter+left] = tempArray[iter];
    }
    return;
}
	//int main()throws IOException
   public static void main(String[] args) throws IOException
	{
	   BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	        int number_of_elements;
	        System.out.println("Enter the number of elements");
	        number_of_elements=Integer.parseInt(in.readLine());
	        int array[]=new int[number_of_elements]; 
	        int iter;
	        System.out.println("Enter the elements one by one");
	        for(iter = 0;iter < number_of_elements;iter++)
	        {
	                array[iter]=Integer.parseInt(in.readLine());
	        }
	        /* Calling this functions sorts the array */
	        MergeSort(array,0,number_of_elements-1); 
	        for(iter = 0;iter < number_of_elements;iter++)
	        {
	                System.out.print(array[iter]+"\t");
	        }
	        System.out.print("\n");
	        return;
	}
   
	}