package java8.imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeDeclarative {

	public static void main(String[] args) {
		
		//Imperative Approach-- how style  of programming
		int sum = 0;
		for(int i=0;i<=100;i++) {
			//sum+=i;
			sum = sum + i;
		}
		System.out.println("Sum using Imperative Approach : "+sum);
		
		//Declarative Approach-- what style  of programming
//		int sum1 = IntStream.rangeClosed(0, 100).sum();
		//multi process environment
		int sum1 = IntStream.rangeClosed(0, 100)// it splits the values
				.parallel().sum();
		System.out.println("Sum using Declarative Approach : "+sum1);
		
		//Imperative Approach-- how style  of programming
		List<Integer>list = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
		List<Integer>uniqueList = new ArrayList<>();
		for(Integer i: list) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println("UniqueList:"+uniqueList);
		//Declarative Approach-- what style  of programming
		List<Integer>uniqueList2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("uniqueList2:"+uniqueList2);
		
	}
}
