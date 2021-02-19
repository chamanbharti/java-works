package java8.method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C");
		
		System.out.println("befor java 8");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("using lambda expression");
		//list.forEach( (String s)->System.out.println(s));
		//list.forEach( (s)->System.out.println(s));
		//list.forEach( s -> System.out.println(s));
		System.out.println("Further reduction in code by let compiler infer types");
		//list.forEach(System.out.println(s)); //this line not working 
		System.out.println("here lambda expression is not doing anything & just calling a method,it can be replaced by method reference");
		list.forEach(System.out::println);
		
	}
}
