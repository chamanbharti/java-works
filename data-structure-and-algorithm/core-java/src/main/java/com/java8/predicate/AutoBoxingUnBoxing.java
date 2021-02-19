package java8.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		
		int[] x = {0,5,10,15,20,25};
		long start = System.currentTimeMillis();
		//Predicate<Integer>p = i -> i%2 == 0;
//		IntPredicate p = i -> i%2 == 0;
//		LongPredicate p = i -> i%2 == 0;
		DoublePredicate p = i -> i%2 == 0;
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(start-end);
  }
}
