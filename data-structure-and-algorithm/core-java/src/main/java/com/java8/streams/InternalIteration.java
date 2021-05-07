package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	public static void main(String[] args) {
		//external iteration
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sum = 0;
		for(int n:numbers) {
			if(n%2==1) {
				int square = n*n;
				sum = sum + square;
			}
		}
		System.out.println(sum);
		//interanl iteration
		int sum1 = numbers.stream().filter(n->n%2==1).map(n->n*n).reduce(0, Integer::sum);
		System.out.println(sum1);
		
		//interanl iteration
		int sum2 = numbers.parallelStream().filter(n->n%2==1).map(n->n*n).reduce(0, Integer::sum);
		System.out.println(sum2);
	}
	
	
	
}
