package com.collection.api.generic;

import java.util.StringJoiner;

public class Pair5 <T extends Comparable<T>>{

	private final T first;
	private final T second;
	
	public Pair5(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	
	public T getLargest() {
		if(first.compareTo(second) > 0) {
			return first;
		}
		return second;
	}
	@Override
	public String toString() {
		return new StringJoiner(", ", Pair5.class.getSimpleName() + "[","]")
				.add("first'"+first+"'")
				.add("second'"+second+"'")
				.toString();
	}
}
