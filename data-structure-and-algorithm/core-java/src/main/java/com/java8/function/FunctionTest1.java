package java8.function;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
		
		System.out.println("Find the given string's length");
		Function<String, Integer>length = s->s.length();
		System.out.println("Chaman:"+length.apply("Chaman"));
		System.out.println("Chaman Bharti:"+length.apply("Chaman Bharti"));
		
		Function<Integer,Integer>f = i->i*i;
		System.out.println("5*5:"+f.apply(5));
		System.out.println("10*10:"+f.apply(10));
	}
}
