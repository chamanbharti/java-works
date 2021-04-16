package functional_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map {

	public static void main(String[] args) {
		/**
		 var mapArray = [1,2,3,4,5,6,7].map(function(value){
    		return value * 10;
		});
		console.log(mapArray);//[10, 20, 30, 40,50,60,70]
		
		 */
		
		List<Integer>list = Arrays.asList(1,2,3,4,5,6,7);
//		list.stream().map(n -> n * 10).forEach(System.out::println);////10, 20, 30, 40,50,60,70
		List<Integer>list2 = list.stream().map(n -> n * 10).collect(Collectors.toList());
		System.out.println(list2);//[10, 20, 30, 40, 50, 60, 70]

		IntStream.rangeClosed(1, 5)
				 .map(n -> n * n)
				 .forEach(System.out::println);//1 4 9 16 25
	}
}
