package com.java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
	
	public static void main(String[] args) {
		
		//Functional Interface types 4
		
		//PredicateTest1 obj = new PredicateTest1();
		//System.out.println(obj.test(5));
		
//		Predicate<Integer> p = i -> i>10;
//		System.out.println(p.test(5));
//		System.out.println(p.test(50));
		//System.out.println(p.test("Chaman"));
		
//		Predicate<String> p = s->s.length()>5;
//		System.out.println(p.test("Chaman"));
		
		
		
		//without predicate for collection
//		PredicateTest1 obj = new PredicateTest1();
//		List<String>l = new ArrayList<>();
//		l.add("A");
//		System.out.println(obj.test(l));
//		List<String>ll = new ArrayList<>();
//		System.out.println(obj.test(ll));
		
//		Predicate<Collection<String>> p = c->c.isEmpty();
//		List<String>l = new ArrayList<>();
//		l.add("A");
//		System.out.println(p.test(l));
//		List<String>ll = new ArrayList<>();
//		System.out.println(p.test(ll));
		
//		int[] x = {0,5,10,15,20,25,30};
//		Predicate<Integer>p1 = i-> i>10;
//		Predicate<Integer>p2 = i-> i%2==0;
//		System.out.println("The numbers greater than 10 are:");
//		m1(p1,x);
//		System.out.println("The even numbers are:");
//		m1(p2,x);
//		
//		System.out.println("The numbers not greater than 10 are:");
//		m1(p1.negate(),x);
//		
//		System.out.println("The numbers greater than 10  and even are:");
//		m1(p1.and(p2),x);
//		
//		System.out.println("The numbers greater than 10  or even are:");
//		m1(p1.or(p2),x);
	
//		String[] names = {"sunny","kajal","mallika","katrina","karina"};
//		Predicate<String> startWithK = s-> s.charAt(0)=='k';
//		System.out.println("The names starts with k are:");
//		for(String s:names) {
//			if(startWithK.test(s))
//				System.out.println(s);
//		}
	}		
}
