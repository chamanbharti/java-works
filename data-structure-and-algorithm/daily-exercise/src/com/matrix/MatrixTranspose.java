package com.matrix;
import java.util.Scanner;
public class MatrixTranspose
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
		int d[][]=new int[rows][columns];
		System.out.println("Enter first matrice");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		System.out.println("Enter second matrice");
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
				c[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				d[i][j]=b[j][i];
			}
		}

		System.out.println("The Transpose of first matrices is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The Transpose of second matrices is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}

}