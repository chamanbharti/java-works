package functional_code;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		
		/**
		 var sum = [0,1,2,3,4].reduce(function(preVal, currentVal, index, array){
	    return preVal + currentVal;
		});
		console.log(sum);//10
		
		var sum2 = [0,1,2,3,4].reduce(function(preVal, currentVal, index, array){
		    return preVal + currentVal;
		}, 1);
		console.log(sum2);//11
		 */
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		int sum = list.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);//10
		int sum2 = list.stream().reduce(1, (n1, n2) -> n1 + n2);
		System.out.println(sum2);//11
	}
	
}
