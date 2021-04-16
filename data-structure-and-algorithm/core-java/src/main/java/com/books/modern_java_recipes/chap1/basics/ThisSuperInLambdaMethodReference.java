package com.books.modern_java_recipes.chap1.basics;

import java.util.function.Function;

@FunctionalInterface
interface Operate {
   int func(int num1, int num2);
   public String toString();
}

interface Defaults {
	   default int doMath(int a) {
	      return 2 * a;
	   }
	}
public class ThisSuperInLambdaMethodReference implements Defaults{

	   @Override
	   public int doMath(int a) {
	      return a * a;
	   }
	
	public static void main(String[] args) {
		ThisSuperInLambdaMethodReference test = new ThisSuperInLambdaMethodReference();
		 test.getResult();
		 
	}

	private void getResult() {
		Operate op = (num1,num2) -> {
			 System.out.println("This hashcode: " + this.hashCode());
	         System.out.println("Calling toString(): "+ this.toString());
	         return num1 + num2;
		};
		System.out.println("Result is: "+ op.func(10, 7));
		
		Function<Integer,Integer>operator1 = this::doMath;
		System.out.println("this::doMath() = " + operator1.apply(10));
		
		 Function<Integer, Integer> operator2 = Defaults.super::doMath;
	     System.out.println("Defaults.super::doMath() = " + operator2.apply(10));
	}
		@Override
	   public String toString() {
	      System.out.println("Super hashcode: " + super.hashCode());
	      return Integer.toString(super.hashCode());
	   }
}
