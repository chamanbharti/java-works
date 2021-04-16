package java8.function;

import java.util.function.*;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		
//		long startTime = System.currentTimeMillis();  
//        
//		BiFunction<String,String,String> f=(s1,s2)->s1+s2; 
//		System.out.println(f.apply("durga","software"));
//		System.out.println("Time taken by executing this Predicate<Integer>: "+(System.currentTimeMillis()-startTime)+"ms");  
//        startTime = System.currentTimeMillis();  
//        
//        BinaryOperator<String> ff=(s1,s2)->s1+s2; 
//		System.out.println(ff.apply("durga","software"));
//        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms");
		
		long startTime = System.currentTimeMillis();  
        
		BinaryOperator<Integer> f=(s1,s2)->s1+s2; 
		System.out.println(f.apply(10,20));
		System.out.println("Time taken by executing this Predicate<Integer>: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        
        IntBinaryOperator ff=(s1,s2)->s1+s2; 
		System.out.println(ff.applyAsInt(10,20));
        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms");
	}
}
