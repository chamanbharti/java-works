package com.collection.api.generic;

import java.util.StringJoiner;

//using Generic
public class Pair2<T> {

	private final T first;
	private final T second;
	
	public Pair2(T first,T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Pair2.class.getSimpleName() + "[","]")
				.add("first'"+first+"'")
				.add("second'"+second+"'")
				.toString();
	}
	
	
}
