package java8.predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateTest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
        
		int[]x = {0,5,10,15,20,25};
		Predicate<Integer>p = i->i%2==0;
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("Time taken by executing this Predicate<Integer>: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        int[]y = {0,5,10,15,20,25};
		IntPredicate q = i->i%2==0;
		for(int x1:y) {
			if(q.test(x1)) {
				System.out.println(x1);
			}
		}
        System.out.println("Time taken by executing this IntPredicate: "+(System.currentTimeMillis()-startTime)+"ms"); 
	}
}
