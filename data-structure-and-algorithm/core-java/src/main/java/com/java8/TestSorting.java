package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
		
		List<Developer>listDevs = getDevelopers();
		
		System.out.println("Before Sort");
		for(Developer d:listDevs){
			System.out.println(d);
		}
		
		/*//Sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				//step I
				//return o1.getAge().compareTo(o2.getAge());//ascending order
				//return o2.getAge().compareTo(o1.getAge()); //descending order
				
				//Step II
				//return o1.getAge() - o2.getAge();//ascending order
				//return o2.getAge() - o1.getAge();//descending order
				
				//Sort by Name
				//return o1.getName().compareTo(o2.getName());
				return o2.getName().compareTo(o1.getName());
			}
			
		});*/
		//Sort by age Lambda
		//listDevs.sort( (Developer o1, Developer o2)->o1.getAge() - o2.getAge());
		
		//lambda, valid, parameter type is optional
		//listDevs.sort( (o1, o2) -> o1.getAge() - o2.getAge());
		//Sort by name
		/*Collections.sort(listDevs, new Comparator<Developer>(){

			@Override
			public int compare(Developer o1, Developer o2) {
				//return o1.getName().compareTo(o2.getName());
				return o2.getName().compareTo(o1.getName());
			}
			
	});*/
		
		//lambda expression
		//listDevs.sort( (Developer o1, Developer o2)-> o1.getName().compareTo(o2.getName()));
		
		//lambda expression
		//listDevs.sort( ( o1, o2) -> o1.getName().compareTo(o2.getName()));
	//Sort by salary
		/*Collections.sort(listDevs, new Comparator<Developer>(){

			@Override
			public int compare(Developer o1, Developer o2) {
				//return o1.getSalary().compareTo(o2.getSalary());
				return o2.getSalary().compareTo(o1.getSalary());
			}
		});*/
		
		//Lambda Expression
		//listDevs.sort( (Developer o1,Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));
		//listDevs.sort( (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
		
		//2. Sort with Lambda
		
//In Java 8, the List interface is supports the sort method directly, no need to use Collections.
//sort anymore
		//List.sort() since java 1.8
		//Sort by age
		/*listDevs.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o2.getAge() - o1.getAge();
			}
		
		});*/
		
		//Lambda expression example :
		//listDevs.sort((Developer o1,Developer o2)-> o1.getAge() - o2.getAge());
		
		//java 8 only, lambda also, print the list
		//System.out.println("List view through lambda:");
		//listDevs.forEach( (d) ->System.out.println(d));
		
		//Reversed sorting.
		// Lambda expression to sort a List using their salary.
		/*Comparator<Developer>salaryComparator = (Developer o1,Developer o2)->o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator);*/
		
		//Lambda expression to sort a List using their salary, reversed order.
		Comparator<Developer> salaryComparator = (o1,o2)->o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(salaryComparator.reversed());
		
		System.out.println("After Sort");
		for(Developer d:listDevs){
			System.out.println(d);
		}
	}

	private static List<Developer> getDevelopers() {

		List<Developer>result = new ArrayList<Developer>();
		result.add(new Developer("Rahi Akela", 35, new BigDecimal("75000")));
		result.add(new Developer("Chaman Bharti", 32, new BigDecimal("50000")));
		result.add(new Developer("Sahil Bharti", 25, new BigDecimal("25000")));
		result.add(new Developer("Aman Bharti", 16, new BigDecimal("20000")));
		result.add(new Developer("Naman Bharti", 14, new BigDecimal("15000")));
		return result;
	}

}
