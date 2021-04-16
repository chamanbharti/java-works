package com.matrix;
import java.util.Scanner;
public class MatrixMultiplication 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=s.nextInt();
		
		System.out.println("Enter number of columns");
		int columns=s.nextInt();
		
		int a[][]=new int[rows][columns];
		int b[][]=new int[rows][columns];
		int c[][]=new int[rows][columns];
		
		System.out.println("Enter the first matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				int sum=0;
				for(int k=0;k<columns;k++)
				  sum=sum + a[i][k] * b[k][j];
				c[i][j]=sum;
			}
		}
		
		System.out.println("The Multiplication of the two matrices is ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
