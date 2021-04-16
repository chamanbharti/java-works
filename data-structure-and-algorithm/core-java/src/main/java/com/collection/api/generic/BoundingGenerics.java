package com.collection.api.generic;

public class BoundingGenerics {

	public static void main(String[] args) {
		
		Pair4<Integer> integerPair =  new Pair4<>(42,500);
		System.out.println(integerPair);
		
		Pair5<String> stringPair =  new Pair5<>("Hello","World");
		System.out.println(stringPair);
		System.out.println(stringPair.getLargest());
		
		Pair5<Integer> integerPair1 =  new Pair5<>(42,500);
		Pair5<Integer> integerPair2 =  new Pair5<>(500,42);
		System.out.println(integerPair1.getLargest());
		System.out.println(integerPair2.getLargest());
	}
}
