package java8.function;

import java.util.function.*;

public class UnaryOperatorTest {

	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();  
//        
//		Function<Integer,Integer>p = i->i*i;
//		System.out.println(p.apply(5));
//		System.out.println("Time taken by executing this Predicate<Integer>: "+(System.currentTimeMillis()-startTime)+"ms");  
//        startTime = System.currentTimeMillis();  
//        
//        UnaryOperator<Integer>p2 = i->i*i;
//		System.out.println(p2.apply(5));
//        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms"); 
		
		long startTime = System.currentTimeMillis();  
        
		UnaryOperator<Integer>p = i->i*i;
		System.out.println(p.apply(5));
		System.out.println("Time taken by executing this Predicate<Integer>: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        
        IntUnaryOperator p2 = i->i*i;
		System.out.println(p2.applyAsInt(5));
        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms");
	}
}
