package com.newfeatures;

interface L{
	public void add(int a,int b);
	//public void product(int a,int b);
}
/*class Demo implements L{

	@Override
	public void add(int a,int b) {
		System.out.println("The Sum:"+(a+b));
		
	}
	
}*/
public class LambdaExpression2 {

	public static void main(String[] args) {
		
		/*L i = new Demo();
		i.add(10, 20);*/
		
		L i = (int a,int b)->System.out.println("The Sum:"+(a+b));
		i.add(10, 20);
		L ii = (a,b)->System.out.println("The Sum:"+(a+b));
		ii.add(10, 20);
		ii.add(100, 200);
		ii.add(1000, 2000);
		
	}
}
