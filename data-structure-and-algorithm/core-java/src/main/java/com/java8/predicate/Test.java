package java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		//System.out.println(test(9));
		//using lambada step I
//	(Integer i) -> {
//			if(i>10)
//				return true;
//			else
//				return false;
//		};
		
		//step II
		// i -> i>10;
		
		Predicate<Integer> greater = i -> i>10;
		//System.out.println(greater.test(9));
		
		Predicate<List<String>>p = c->c.isEmpty();
		List<String>l = new ArrayList<>();
		//System.out.println(p.test(l));
		
		List<String>l1 = new ArrayList<>();
		l1.add("A");
		//System.out.println(p.test(l1));
		//System.out.println(p.negate().test(l1));
		
		Predicate<String> isEqual = Predicate.isEqual("Chaman");
		System.out.println(isEqual.test("Bharti"));
		System.out.println(isEqual.negate().test("Bharti"));
		
	}

	private static boolean test(int i) {
		if(i>10)
			return true;
		else
			return false;
	}

}
