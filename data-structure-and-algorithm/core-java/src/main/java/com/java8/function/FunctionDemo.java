package com.java8.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
//		Function<String, Integer> f = s -> s.length();
//		System.out.println(f.apply("Chaman"));//6
//		
//		String str = "durga software solutions hyderabad";
//		Function<String,String> replaceSpace = s -> s.replaceAll(" ", "");
//		System.out.println(replaceSpace.apply(str));
//		
//		Function<String,Integer>findTheLengthOfSpace = s1->s1.length() - s1.replaceAll(" ","").length();
//		System.out.println(findTheLengthOfSpace.apply(str));
		
		Function<Integer,String>returnNo = n -> {
			if(n % 2 ==0) {
				return n+" is even number";
			}else {
				return n+" is odd number";
			}
		};
		System.out.println(returnNo.apply(5));
		System.out.println(returnNo.apply(8));
		
		Function<Integer, Integer> function1 = t -> (t - 5);
		Function<Integer, Integer> function2 = t -> (t * 2);
		
		//Using andThen() method
		int a = function1.andThen(function2).apply(50);
		System.out.println(a);
		//Using compose function
		int b = function1.compose(function2).apply(50);
		System.out.println(b);
		
		Function<String,Boolean>test = i -> i.isEmpty();
		System.out.println(test.apply("d"));
		
	}
}
