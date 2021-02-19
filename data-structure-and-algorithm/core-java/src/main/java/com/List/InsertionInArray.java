package List;

import java.util.Scanner;

public class InsertionInArray 
{
	//Insertion in Array
	//int i,len,pos,num;
	//void insert(int a[],int,int,int);
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int a[]=new int[100];
		
		  //void insert(int a[],int,int,int);
		  System.out.println("Enter the length of array:");
		  //scanf("%d",&len);
		  int len=input.nextInt();
		  System.out.println("Enter integers:");
		  for(int i=0;i<len;i++)
		  {
		    //scanf("%d",&a[i]); 
			  a[i]=input.nextInt();
		  }  
		  System.out.println("Enter integer to be inserted: ");
		  //scanf("%d",&num);
		  int num=input.nextInt();
		  System.out.println("Enter position in the array for insertion: ");
		  //scanf("%d",&pos);
		  int pos=input.nextInt();
		 // --pos;
		  insert(a,len,pos,num);//function call
		  //getch();  
		  
		}
	
	
	public static void insert(int a[],int len,int pos,int num)
	 // void insert()
		{
		  if(pos>len)
		  {
			  System.out.println("Insertion outside the array ");           
		  }     
		  else
		  {
		     for(int i=len;i>=pos;i--)
		     {
		       a[i+1]=a[i];                     
		     }    
		     
		     a[pos]=num;
		     len++;
		     System.out.println("New array is:\n");
		     for(int i=0;i<len;i++)
		     {
		       //printf("%d\n",a[i]);   
		    	 System.out.println(a[i]);
		     }
		      
		  }
		     
		}
	}
	
