package java8.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class IntermediateOperationsStream {

	public static void main(String[] args) {
		
		/**
		 * filter()
		 * map()
		 * flatMap()
		 * distinct()
		 * sorted()
		 * peek()
		 * limit()
		 * skip()
		 * all in one program
		 */
		
		//filter()
//		List<Integer>list = Arrays.asList(1,2,3,4);
//		list.stream().filter(p->p%2==0).forEach(System.out::println);
		
		//map()
//		List<Integer>list = Arrays.asList(1,2,3,4);
//		list.stream().filter(p->p%2==0).map(a->a+",").forEach(System.out::print);
		
		//flatMap()
//		List<String>list = Arrays.asList("ab","bc","cd");
//		list.stream().flatMap(a->Stream.of(a.charAt(0))).forEach(System.out::print);
		
		//distinct
//		List<String>list = Arrays.asList("ab","ab","cd");
//		list.stream().distinct().forEach(System.out::print);
		
		//sorted()
//		List<String>list = Arrays.asList("bb","ab","cd");
//		list.stream().sorted().forEach(System.out::print);
		
		//peek
//		List<String>list = Arrays.asList("bb","ab","cd");
//		list.stream().peek(System.out::print).findFirst();
		
		//limit()
//		List<String>list = Arrays.asList("bb","ab","cd");
//		list.stream().limit(2).forEach(System.out::print);
		
		//skip()
		List<String>list = Arrays.asList("bb","ab","cd");
		list.stream().skip(2).forEach(System.out::print);
		
	}
}
