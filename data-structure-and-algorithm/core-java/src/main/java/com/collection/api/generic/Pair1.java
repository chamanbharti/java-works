package com.collection.api.generic;

import java.util.StringJoiner;

public class Pair1 {

	private final String first;
	private final String second;
	
	public Pair1(String first,String second) {
		this.first = first;
		this.second = second;
	}

	public String getFirst() {
		return first;
	}

	public String getSecond() {
		return second;
	}

//	@Override
//	public String toString() {
//		return "Pair [first=" + first + ", second=" + second + "]";
//	}

//	@Override
//	public String toString() {
//		return "Pair [first=" + first + ", second=" + second + ", getFirst()=" + getFirst() + ", getSecond()="
//				+ getSecond() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}
	
	@Override
	public String toString() {
		return new StringJoiner(", ", Pair1.class.getSimpleName() + "[","]")
				.add("first'"+first+"'")
				.add("second'"+second+"'")
				.toString();
	}
	
	
}
