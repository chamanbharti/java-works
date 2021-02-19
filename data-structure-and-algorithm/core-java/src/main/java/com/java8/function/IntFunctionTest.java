package java8.function;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntFunctionTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
        
		Function<Integer,Integer>p = i->i*i;
		System.out.println(p.apply(5));
		System.out.println("Time taken by executing this Predicate<Integer>: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        
        IntFunction<Integer>p2 = i->i*i;
		System.out.println(p2.apply(5));
        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms"); 
	}
}
