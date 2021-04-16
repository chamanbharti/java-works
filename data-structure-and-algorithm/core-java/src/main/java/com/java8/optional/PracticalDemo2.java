package com.java8.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticalDemo2 {

	public static void main(String[] args) {
		//creating empty optional object
		 Optional<String> string = Optional.empty();
		 Optional<Double> decimal = Optional.empty();
		// Creating Optional object
	      Optional<String> string2 = Optional.of("Optinal class example");
	      Optional<Double> decimal2 = Optional.of(45.51);

	      // Creating nullable Optional object
	      Optional<String> string3 = Optional.ofNullable(null);
	      Optional<Double> decimal3 = Optional.ofNullable(null);
	      
	      //isPresent
	      System.out.println("**isPresent**");
	      if(string2.isPresent()) {
	    	  System.out.println(string2.get());
	      }
	      System.out.println("**ifPresent**");
	      string2.ifPresent(System.out::println);
	      
	      System.out.println("**orElse**");
	      String str1 = string.orElse("orElse block");
	      System.out.println(str1);
	      String str2 = string2.orElse("orElse block");
	      System.out.println(str2);
	      
	      System.out.println("**orElseGet**");
	      String str3 = string.orElseGet( () -> "orElseGet Block");
	      System.out.println(str3);
	      String str4 = string2.orElseGet( () -> "orElseGet Block");
	      System.out.println(str4);
	      
	      System.out.println("**orElseThrow**");
//	      String str5 = null;
//		System.out.println(str5.toString());
		try {
			//String str5 = string.orElseThrow( () -> new Exception("Value is not present in optional"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String str6 = string2.orElseThrow( () -> new Exception("Value is not present in optional"));
			System.out.println(str6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		  System.out.println("**filter**");
		 Optional<String> ofOptional = Optional.of("Java Optional example");
		 Optional<String> ofOptional2 = ofOptional.filter( s-> s.contains("Optional"));
		 ofOptional2.ifPresent(System.out::println);
		 
		 System.out.println("**map**");
		 Optional<String> ofOpt1 = ofOptional.map(String::toUpperCase);
		 ofOpt1.ifPresent(System.out::println);
		 
		 System.out.println("**flatMap**");
		 Optional<String> ofOpt2 = ofOptional.flatMap( s-> Optional.of(s+" - flatMap()"));
		 ofOpt2.ifPresent(System.out::println);
		 
		//Java 9 Additions
		 System.out.println("**or**");
		 Employee e = new Employee("Chaman", 35);
		 e=null;
		 Employee result = Optional.ofNullable(e).or( () -> Optional.of(new Employee("Mamta",24))).get();
		 System.out.println(result.getName());
		 
		 System.out.println("**ifPresentOrElse**");
//		 Optional<Integer>op = Optional.of(9455);
		 Optional<Integer>op = Optional.ofNullable(null);
		 //print value
		 System.out.println("Optional:"+op);
		 //apply ifPresentOrElse
		 op.ifPresentOrElse(
				 	value -> {
				 		System.out.println("Value is present, its:"+value);
				 	}, 

				 	() -> {
				 		System.out.println("Value is empty");
				 	}
				 	);
		 System.out.println("**stream**");
		 Employee ee = new Employee("chaman.bharti@gmail.com", 35);
		 List<String> names = Optional.ofNullable(ee)
				 .stream()
				 .filter( u -> u.getName()!=null && u.getName().contains("@"))
				 .map( u -> u.getName())
				 .collect(Collectors.toList());
		 System.out.println(names);
	}
}
