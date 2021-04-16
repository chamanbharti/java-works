package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
public class MapReduceFilter {

	public static void main(String[] args) {
		
		List<Integer>numbers = Arrays.asList(3,2,7,8,10,5,9);
		
		// sequential and not parallel
		int sum1 = 0;
		for(int i=0;i<numbers.size();i++) {
			sum1 = sum1 + numbers.get(i);
		}
		System.out.println(sum1);
		
		// parallel processing
		int sum2 = numbers.stream().mapToInt(i->i).sum();// lambda expression
		System.out.println(sum2);
		
		int sum3 = numbers.stream().mapToInt(Integer::intValue).sum(); // method reference
		System.out.println(sum3);
		
		int sum4 = numbers.stream().reduce(0, (a,b) -> a + b);
		System.out.println(sum4);
		
		Optional<Integer> sum5 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum5.get());
		
		Integer multipleResult = numbers.stream().reduce(1, (a,b) -> a * b);
		System.out.println(multipleResult);
		
		
		int max = numbers.stream().reduce(0,(a,b) -> a > b ? a : b);
		System.out.println(max);
		
		Optional<Integer> max2 = numbers.stream().reduce(Integer::max);
		System.out.println(max2.get());
		
		
		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
		System.out.println(min.getAsInt());
		
		List<String>words = Arrays.asList("corejava","abc","spring","hiberante");
		String longString = words
				.stream()
				.reduce( (word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("long string:"+longString);
		
		String shortString = words
				.stream()
				.reduce( (word1,word2) -> word1.length() < word2.length() ? word1 : word2).get();
		System.out.println("short string:"+shortString);
		
		// get employee whos grade A
		// get salary
		double averageSalary = EmployeeDatabase.getEmployee().stream()
		.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
		.map(employee -> employee.getSalary())
		.mapToDouble(i -> i)
		.average().getAsDouble();
		System.out.println("Average Salary:"+averageSalary);
		
		double sumSalary = EmployeeDatabase.getEmployee().stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary())
				.mapToDouble(i -> i)
				.sum();
				System.out.println("Average Salary:"+sumSalary);
		
	}
}
