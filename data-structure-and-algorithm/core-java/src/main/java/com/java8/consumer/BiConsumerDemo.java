package com.java8.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, String> c = (s1,s2) -> System.out.println(s1+s2);
		c.accept("Chaman", "Bharti");
	}
}
