package com.newfeatures;

interface M{
	public int squareIt(int n);
}
//class Demo implements M{
//
//	@Override
//	public int squareIt(int n) {
//		return n*n;
//		
//	}
//
//}

public class LambdaExpression3 {

	public static void main(String[] args) {
		
//		M m = new Demo();
//		int square = m.squareIt(5);
//		System.out.println("Square:"+square);
		
		//M m = n->n*n;
		//System.out.println(m.squareIt(5));
		
		//M m = (int n)->{return n*n;};
		
		//M m = (int n) -> n*n;
		
		//M m = (n) -> n*n;
		
		M m = n -> n*n; //if argument is one then () is optional
		System.out.println(m.squareIt(9));
		
	}
}
