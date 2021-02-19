package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
class ConsumerClass{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Java8Features2 {

	public static void main(String[] args) {
		
		// Functional Interface has 4 types
		
		//1. Predicate---boolean result
		Predicate<String>checkLength = str->str.length()>5;
		System.out.println(checkLength.negate().test("abcd"));
		
		//2. Consumer---modified data --no result
		ConsumerClass p = new ConsumerClass();
		Consumer<ConsumerClass>setName = t->t.setName("Play Java");
		setName.accept(p);
		System.out.println(p.getName());
		
		//3. Function---both input and output
		Function<Integer,String>getInt = t->t*10+" multiplied by";
		System.out.println(getInt.apply(2));
		
		
		//4. Supplier ---only output
		Supplier<Double>getRandom = ()->Math.random();
		System.out.println(getRandom.get());//no input
	}
	
}
