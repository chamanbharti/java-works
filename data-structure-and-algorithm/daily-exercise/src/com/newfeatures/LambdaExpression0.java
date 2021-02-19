package com.newfeatures;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface A{
	public void m1();
	//public void m11();
	
	
}
@FunctionalInterface
interface B extends A{
	//public void m2();
}
public class LambdaExpression0 {
	
	public static void main(String[] args){
		
		//System.out.println("the square of 4:"+squareIt(4));
		
		Function<Integer, Integer> f = i->i*i;//declare before use
		System.out.println("the square of 4:"+f.apply(4));
		System.out.println("the square of 4:"+f.apply(5));
		Predicate<Integer> p = i->i%2==0;
		System.out.println("4 is even or not:"+p.test(4));
      
		
        

		
	}
	
	/*public static int squareIt(int n){
	 return n*n;
	}*/
	
	
			
}
