package com.matrix;
import java.util.Scanner;
public class MatrixMultiplication2 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and column of first matrix");
		int r1=s.nextInt();
		int c1=s.nextInt();
		
		System.out.println("Enter the row and column of second matrix");
		int r2=s.nextInt();
		int c2=s.nextInt();
		
		
		if(c1!=r2)
		  {
			System.out.println("Matrix mutiplication is not possible");
			System.out.println("Column of first matrix must be same as row of second matrix");
		  }
		
		  else
		  {
			  System.out.println("Enter the first matrix");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						a[i][j]=s.nextInt();
					}
				}
				
				System.out.println("Enter the second matrix");
				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						b[i][j]=s.nextInt();
					}
				}
				
				
				//for(int i=0;i<r1;i++)
				//for(int j=0;j<c2;j++)
				//	 c[i][j]=0;
				
				for(int i=0;i<r1;i++)//row of first matrice
				{
					for(int j=0;j<c2;j++)//row of first matrice
					{
						int sum=0;
						for(int k=0;k<c1;k++)
						{
							sum=sum + a[i][k] * b[k][j];
							c[i][j]=sum;
						}
					}
				}
				System.out.println("The Multiplication of the two matrices is ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c2;j++)
					{
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
		  }
		
	}

}
