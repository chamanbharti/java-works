package functional_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		/**
		 var filterArray = [100,2003,10,203,333,12].filter(function(value){
	      return value > 100;
	     });
	     console.log(filterArray);//[ 2003, 203, 333 ]
		 */
		
		List<Integer> filterArray = Arrays.asList(100,2003,10,203,333,12);
		//filterArray.stream().filter(n -> n > 100).forEach(System.out::println);// 2003, 203, 333
		List<Integer> filterArray2 = filterArray.stream().filter(n -> n > 100).collect(Collectors.toList());
		System.out.println(filterArray2);//[2003, 203, 333]
	}
}
