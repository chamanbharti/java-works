package com.java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

//without labda & predicate
//public class PredicateDemo {
//	public boolean test(Integer i) {
//		if(i>10) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//with labda & predicate
public class PredicateDemo {
	
	
	public static void main(String[] args) {
//		PredicateDemo obj = new PredicateDemo();
//		System.out.println(obj.test(9));
		
		//Predicate<Integer> p = i-> i>10;
//		Predicate<Integer> p = i-> (i>10);
//		System.out.println(p.test(9));
//		System.out.println(p.test(11));
		
		//Predicate<String> p = s-> s.length()>3;
//		Predicate<String> p = s-> (s.length()>3);
//		System.out.println(p.test("Chaman"));
//		System.out.println(p.test("Cha"));
		
//		Predicate<Collection<String>> p = c -> c.isEmpty();
//		List<String> al = new ArrayList<>();
//		al.add("Chaman");
//		System.out.println(p.test(al));
		
		//Predicate joining
		
//		int[] x = {0, 5, 10, 15, 20, 25, 30};
//		Predicate<Integer>p1 = i -> i>10;
//		Predicate<Integer>p2 = i -> i % 2 == 0;
//		System.out.println("The Numbers Greater Than 10:");
//		m1(p1,x);
//		System.out.println("The Even Numbers Are:");
//		m1(p2,x);
//		System.out.println("The Numbers Not Greater Than 10:");
//		m1(p1.negate(),x);
//		System.out.println("The Numbers Greater Than 10 And Even Are:");
//		m1(p1.and(p2),x);
//		System.out.println("The Numbers Greater Than 10 OR Even:");
//		m1(p1.or(p2),x);
//	}
//
//	private static void m1(Predicate<Integer> p1, int[] x) {
//		for(int x1:x) {
//			if(p1.test(x1))
//				System.out.println(x1);
//		}
		
		
//		Predicate<String>checkEquality = s -> s.equals("Hello");
//		System.out.println(checkEquality.test("Hello"));//true
//		System.out.println(checkEquality.test("Hello World"));//false
//		Predicate<Integer>checkNumber = s -> s > 0;
//		System.out.println(checkNumber.test(5));//true
//		System.out.println(checkNumber.test(-5));//false
		
		
		Predicate<String> p = s -> s.equals("Hello");
		
		//AND logical operation ;
		Predicate<String>predicateAnd = p.and(s->s.length()>4);
		System.out.println(predicateAnd.test("Hello"));
		
		//OR logical operation
		Predicate<String>predicateOr = p.or(s->s.length() == 10);
		System.out.println(predicateOr.test("Hello"));
		
		//NEGATE logical operation
		Predicate<String>predicateNegate = p.negate();
		System.out.println(predicateNegate.test("Hello"));
		
	}
	
}
	

