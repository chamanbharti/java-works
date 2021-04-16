package java8.streams;

import java.util.stream.*;

public class JavaStream {

	public static void main(String[] args) {
//		// 1. Integer Stream
		IntStream
		.range(1, 10)
		.forEach(System.out::print);
		System.out.println();
		
		// 2. Integer Stream with skip
//		IntStream
//		.range(1, 10)
//		.skip(5)
//		.forEach(x->System.out.print(x));
//		System.out.println();
		
		// 3. Integer Stream with sum
//		System.out.println(
//				IntStream
//				.range(1, 10)
//				.sum()
//				);
//		System.out.println();
		
		
	}
}
