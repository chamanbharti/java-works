package java8.streams.primitive;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {
	public static void main(String[] args) {
		//IntStream
		int[] ints = {1,2,3};
		IntStream stream = Arrays.stream(ints);
		stream.forEach(System.out::println);
		//LongStream
		long[] longs = {1,2,3};
		LongStream stream2 = Arrays.stream(longs);
		stream2.forEach(System.out::println);
		//DoubleStream
		double[] doubles = {1,2,3};
		DoubleStream stream3 = Arrays.stream(doubles);
		stream3.forEach(System.out::println);
	}
}
