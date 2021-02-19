package ds.array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		//declarationof array
		
//		int[] x;
//		int y [];
//		int z[];
//		//int[4] a; //invalid
		
		//2D
//		int[][] a1;
//		int [][]a2;
//		int a3[][];
//		int[] []a4;
//		int[] a5[];
//		int []a6[];
		
		//2D
		//int[] a,b; // a-->1,b-->1
		//int[] a[],b; // a-->2,b-->1
		//int[] a[],b[]; // a-->2,b-->2
		//int[] []a,b; // a-->2,b-->2
		//int[] []a,b[]; // a-->2,b-->3
		//int[] a[],[]b; //invalid
		
		//3D
		//int[][][] a; // a-->3
		//int [][][]a; // a-->3
		//int[] a[][][]; // a-->3
		//int[] [][]a; // a-->3
		//int[] a[][]; // a-->3
		//int[] []a[]
		//int[][] []a
		//int[][] a[]
		//int [][]a[]
		//int []a[][]
		
//		int[] a=new int[3];
//		System.out.println(a.getClass().getName());//[I

//		int[][] a=new int[3][2];
//		System.out.println(a.getClass().getName());//[[I
		
//		double[][] a=new double[3][2];
//		System.out.println(a.getClass().getName());//[[D
		
		
//		long[][] a=new long[3][2];
//		System.out.println(a.getClass().getName());//[[J
		
//		byte[][] a=new byte[3][2];
//		System.out.println(a.getClass().getName());//[[B
		
//		boolean[][] a=new boolean[3][2];
//		System.out.println(a.getClass().getName());//[[Z
		
//		Object[][] a=new Object[3][2];
//		System.out.println(a.getClass().getName());//[[Ljava.lang.Object;
		
		//int[] x = new int[];//invalid
		//int[] x = new int[2];
		
//		int[] x = new int[0];
//		int[] x = new int[-3];
//		System.out.println(x.length);//NegativeArraySizeException

//		int[] x = new int[10];
//		int[] xx = new int['A'];
//		xx[64]=110;
//		System.out.println(xx.length+" "+xx[64]);
//		
//		byte b = 20;
//		int[] y = new int[b];
//		short s = 30;
//		int[] z = new int[s];
		
		/*
		byte-->short-->int-->long-->float-->double
						|
		char-------------
		*/
//		int[] xxx = new int[2147483647];
//		System.out.println(xxx.length);//OutOfMemoryError
		
//		int[] xxx = new int[2147483648];//invalid
//		System.out.println(xxx.length);//out of range
		
		
		/*
		2D Array
		Matrix is the 2d array
		Array of Arrays
		java follow array of arrays to create 2d array not matrix way
		     ........
		s--> |	|	|
		     ........
			   |   |
			 .....  .......
			 | | |  | | | |
		     .....  .......
		*/
		int[][] s = new int[2][];
		s[0]=new int[2];
		s[1]=new int[3];
		//[[0, 0], [0, 0, 0]]
		
		//3D array
		int[][][] t = new int[2][][];
		t[0] = new int[3][];
		t[0][0] = new int[1];
		t[0][1] = new int[2];
		t[0][2] = new int[3];
		
		t[1] = new int[2][2];
		
//		int[] x = new int[3]; 
//		System.out.println(x);
//		System.out.println(x[0]);//classname@hashcode_in_hexadecimalform
//		
//		int[][] y = new int[2][3];
//		System.out.println(y);
//		System.out.println(y[0]);
//		System.out.println(y[0][0]);
		
//		int[][] y = new int[2][];
//		System.out.println(y);
//		System.out.println(y[0]);
//		System.out.println(y[0][0]);
		
		int[] y = new int[6];
		
		y[-4]=40;
		//y[6]=60;
		System.out.println(y);
		Thread
	}

}
