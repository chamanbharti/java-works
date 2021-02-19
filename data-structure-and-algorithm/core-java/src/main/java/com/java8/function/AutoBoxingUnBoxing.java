package java8.function;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		//Function<Integer,Integer>f = i -> i*i;
		//System.out.println(f.apply(4));
//		Function<String,Integer>findLength = s -> s.length();
//		System.out.println(findLength.apply("Chaman"));
		Function<Integer,Double>square = i -> Math.sqrt(i);
		System.out.println(square.apply(7));
		System.out.println("Time taken by Function<Integer,Integer>: " +(System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
//		IntFunction<Integer>f1 = i -> i*i;
//		System.out.println(f1.apply(4));
//		ToIntFunction<String>findLength2 = s -> s.length();
//		System.out.println(findLength2.applyAsInt("Chaman"));
		IntToDoubleFunction square2 = i -> Math.sqrt(i);
		System.out.println(square2.applyAsDouble(7));
		System.out.println("Time taken by IntFunction<Integer>: " +(System.currentTimeMillis() - startTime)+"ms");
  }
}
