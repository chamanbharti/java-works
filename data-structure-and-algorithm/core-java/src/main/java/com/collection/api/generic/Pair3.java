package com.collection.api.generic;

import java.util.StringJoiner;

//using Generic
public class Pair3<T, S> {

	private final T first;
	private final S second;
	
	public Pair3(T first,S second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Pair3.class.getSimpleName() + "[","]")
				.add("first'"+first+"'")
				.add("second'"+second+"'")
				.toString();
	}
	
	
}
