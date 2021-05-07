package com.java8.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

// https://techndeck.com/java-8-program-to-calculate-average-of-n-numbers/
public class AverageDemo {

	public static void main(String[] args) {
		
		
		int[] a = {20, 50, 99, 12, 94};
		
		System.out.println("traditional approach");
		int sum = 0;
		int count = 0;
		for(int i:a) {
			sum = sum+i;
			count++;
		}
		System.out.println("count:"+count+"\nsum:"+sum);
		double average = sum / count;
		System.out.println(average);
		
		System.out.println("java 8 approach 1");
		List<Integer>list = Arrays.asList(20, 50, 99, 12, 94);
		OptionalDouble average2 = list.stream().mapToInt(no->no.intValue()).average();
		System.out.println(average2);
		
		System.out.println("java 8 approach 2");
		IntStream streamOfNumIntStream = Arrays.stream(a);
		OptionalDouble averageOfNumbers = streamOfNumIntStream.average();
		System.out.println(averageOfNumbers);
	}
}
