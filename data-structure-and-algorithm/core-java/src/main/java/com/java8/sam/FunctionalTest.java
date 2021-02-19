package java8.sam;

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

public class FunctionalTest {

	public static void main(String[] args) {
		
		/*
		 Predicate  --> boolean test(T obj)
		 BiPredicate --> boolean test(T obj1, T obj2)
		 */
		/*
		Predicate<Integer> p = x -> x > 50;
		System.out.println(p.test(100));
		
		BiPredicate<Integer,Integer> p2 = (x,y) -> x > y;
		System.out.println(p2.test(100,90));
		*/
		
		/*
		 Consumer  --> boolean accept(T obj)
		 BiConsumer --> boolean accept(T obj1, T obj2)
		 */
		/*
		Consumer<String> con = x-> System.out.println(x.length());
		con.accept("Chaman");
		
		List<Integer> list = Arrays.asList(4,45,1,6,8);
		//list.stream().forEach(x -> System.out.println(x));
				//equivalent to below line		
		Consumer<Integer> con2 = x-> System.out.println(x);
		list.stream().forEach(con2);
		
		BiConsumer<String, String> bCon1 = (a,b) -> System.out.println(a+":"+b);
		bCon1.accept("Chaman","Bharti");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Chaman");
		map.put(2, "Bharti");
		map.put(3, "Sahil");
		//map.forEach( (x,y) -> System.out.println(x+":"+y));
				//equivalent to below line
		BiConsumer<Integer, String> bCon2 = (a,b) -> System.out.println(a+":"+b);
		map.forEach(bCon2);
		*/
		
		/*
		 Function  --> boolean apply(T obj)
		 BiFunction --> boolean apply(T obj1, T obj2)
		 */
		
		/*
		Function<Integer,Boolean> f1 = x -> x > 50;
		System.out.println(f1.apply(60));
		
		BiFunction<Integer,Integer,String> f2 = (x,y) -> x+""+y;
		System.out.println(f2.apply(60,7));
		*/
		
		/*
		 Supplier  --> E get()
		 */
		/*
		Supplier<Integer> sup1 = () -> 404;
		Supplier<String> sup2 = () -> "Not Found";
		System.out.println(sup1.get()+":"+sup2.get());
		*/
		
		/*
		 UnaryOperator  --> 
		 BinaryOperator
		 */
		/*
		UnaryOperator<String> u1 = x -> "Hello "+x;
		System.out.println(u1.apply("Chaman"));
		
		UnaryOperator<Integer> u2 = x -> x + 2;
		System.out.println(u2.apply(40));
		
		BinaryOperator<String> bo1 = (x,y) -> "Hello "+x +" "+ y;
		System.out.println(bo1.apply("Chaman","Bharti"));
		
		BinaryOperator<Integer> bo2 = (x,y) -> x + y;
		System.out.println(bo2.apply(40,50));
		*/
		
	}
}
