package java8.function;

import java.util.function.Function;

public class FunctionTest2 {

	public static void main(String[] args) {
		
		int increment = incrementByOne(1);
		System.out.println(increment);
		
		int increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);
		
		int multiply10 = multiplyBy10Function.apply(increment2);
		System.out.println(multiply10);
		
		Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
		System.out.println(addBy1AndThenMultiplyBy10.apply(1));
	}
	static Function<Integer, Integer> incrementByOneFunction = number->number + 1;
	static int incrementByOne(int number) {
		return number + 1;
	}
	static Function<Integer, Integer> multiplyBy10Function = number->number * 10;
}
