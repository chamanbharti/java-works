package List;

import java.util.Scanner;

public class DeletionInArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[100];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		//scanf("%d",&len);
		int len=input.nextInt();
		System.out.println("Enter integers:");
		for(int i=0;i<len;i++)
		  {
		    //scanf("%d",&a[i]);  
			a[i]=input.nextInt();
		  }  
		  System.out.println("On which positon element do you want to delete: ");
		 // scanf("%d",&pos);
		  int pos=input.nextInt();
		  del(a,pos,len);//function call
		
	}

	private static void del(int[] a, int pos, int len) 
	{
		int j,item;
		  item=a[pos];  
		     for(j=pos;j<len;j++)
		     {
		       a[j]=a[j+1];                     
		     }    
		     len=len-1;
		     System.out.printf("%d is deleted\n",item);
		     System.out.println("New array is:\n");
		     for(int i=0;i<len;i++)
		     {
		    	 System.out.println(a[i]);                  
		     }
		
	}
}
