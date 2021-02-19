package java8.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class TerminalOperationsStream {

	public static void main(String[] args) {
		
		/**
		 * toArray()
		 * collect()
		 * count()
		 * reduce()
		 * forEach()
		 * forEachOrdered()
		 * min()
		 * max()
		 * anyMatch()
		 * allMatch()
		 * noneMatch()
		 * findAny()
		 * findFirst()
		 * all in one program
		 */
		
		//toArray()
//		List<Integer>list = Arrays.asList(1,2,3,4);
//		Object[] arr = list.stream().toArray();//convert to array
//		System.out.println(arr[0]);
		
		//collect()
//		List<Integer>list = Arrays.asList(1,1,2,3,4,3);
//		list.stream().collect(Collectors.toSet()).forEach(System.out::println);;//convert to set
		
		//count
//		List<Integer>list = Arrays.asList(1,1,2,3,4,3);
//		System.out.println(list.stream().count());
//		long totalNumber = list.stream().count();
//		System.out.println(totalNumber);
		
		//reduce()
//		List<Integer>list = Arrays.asList(1,1,2,3,4);
//		System.out.println(list.stream().reduce(0,(x,y)->(x+y)));
//		int totalNumber = list.stream().reduce(0,(x,y)->(x+y));
//		System.out.println(totalNumber);
		
//		//forEach
//		List<Integer>list = Arrays.asList(1,1,2,3,4);
//		list.stream().forEach(System.out:: println);
		
//		//forEachOrdered
//		List<Integer>list = Arrays.asList(4,1,3,1,4,2);
//		list.stream().forEachOrdered(System.out:: println);
		
		//min
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		Optional<Integer>value = list.stream().min((a,b)->a-b);
//		System.out.println(value.get());
		
		//max
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		Optional<Integer>value = list.stream().max((a,b)->a-b);
//		System.out.println(value.get());
		
		//anyMatch
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().anyMatch(a->a==5));
		
		//allMatch
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().allMatch(a->a/1==a));
		
		//noneMatch
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().noneMatch(a->a==5));
		
		//findFirst()
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().findFirst().get());
		
		//findAny()
		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
		System.out.println(list.stream().findAny().get());
	}
}
