package com.java8.predicate;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer>p = (a,b) -> (a+b) % 2 == 0;
		//System.out.println(p.test(10,20));
		//System.out.println(p.test(15,20));
		
		/**
		 * isNullOrEmpty checks s has null," " (whitespace) and "" (blank) value
		 */
		 Predicate<String> isNullOrEmpty = s-> s != null && !s.trim().isEmpty();
		 BiPredicate<String, String> isEquals = (a,b) -> a.equals(b);
		//AND logical operation ;
//			Predicate<String>predicateAnd = p.and(s->s.length()>4);
//			System.out.println(predicateAnd.test("Hello"));
		 
//		 if(isNullOrEmpty.test("Chaman") && isEquals.test("Chaman", "Chaman")) {
//				System.out.println("Correct");
//		 }
//		 Predicate<String>predicateAnd = isNullOrEmpty.and(isEquals);
//		 if(isNullOrEmpty.test("Chaman") && isEquals.test("Chaman", "Chaman")) {
//				System.out.println("Correct");
//		 }
		 Function<Integer,Integer> f=i->i*i; 
		 System.out.println(f.apply(5));
		 Function<String,String> ff = i->i.equals("Chaman")?"1":"2"; 
		 System.out.println(ff.apply("Chaman").toString());
	}

}
