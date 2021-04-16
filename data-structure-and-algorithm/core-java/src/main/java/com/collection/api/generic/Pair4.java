package com.collection.api.generic;

import java.util.StringJoiner;

public class Pair4 <T extends Number>{

	private final T first;
	private final T second;
	
	public Pair4(T first, T second) {
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
		return new StringJoiner(", ", Pair4.class.getSimpleName() + "[","]")
				.add("first'"+first+"'")
				.add("second'"+second+"'")
				.toString();
	}
}
