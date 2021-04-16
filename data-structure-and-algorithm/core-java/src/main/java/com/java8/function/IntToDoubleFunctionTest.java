package java8.function;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;

public class IntToDoubleFunctionTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
        
		Function<Integer,Double>p = i->Math.sqrt(i);
		System.out.println(p.apply(9));
		System.out.println("Time taken by executing this Function<Integer,Double>: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        
        IntToDoubleFunction p2 = i->Math.sqrt(i);
		System.out.println(p2.applyAsDouble(9));
        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms"); 
	}
}
