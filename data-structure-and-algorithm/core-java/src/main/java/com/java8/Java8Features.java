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

@FunctionalInterface
interface Anonymous {
	//public void show();
	public default void printInt(int x) {}
	public static void display() {}
	public int add(int a,int b);
}
public class Java8Features {

	public static void main(String[] args) {
		
		/*
		Anonymous obj = new Anonymous() {
			public void show() {
				System.out.println("Hello Anonymous!!");
			}
			public void printInt(int x) {
				System.out.println(x);
			}
		};
		
		obj.show();
		obj.printInt(54);
		*/
		
//		Anonymous lambda = ()->System.out.println("Hello Anonymous!!");
//		lambda.show();
		
//		Anonymous lambda = (a,b) -> a+b;
//		System.out.println(lambda.add(10, 30));
		
		
		List<Employee> list = new ArrayList<>();
		list.addAll(
					Arrays.asList(
								new Employee(105, "Naman", "Bharti", 20),
								new Employee(101, "Rahi", "Akela", 40),
								new Employee(102, "Chaman", "Bharti", 35),
								new Employee(103, "Sahil", "Bharti", 30),
								new Employee(104, "Aman", "Bharti", 25)
								
							)
				);
		System.out.println(list);
		/*
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				//return e1.getAge() - e1.getAge();//insertion order
				//return e2.getAge() - e2.getAge();//insertion order
				
				//return e1.getAge() - e2.getAge();//ascending order
				//return e2.getAge() - e1.getAge();//descending order
				
				//return e1.getFirstName().compareTo(e1.getFirstName());//insertion order
				//return e2.getFirstName().compareTo(e2.getFirstName());//insertion order
				
				//return e2.getAge() - e2.getAge();//insertion order
				//return e1.getFirstName().compareTo(e2.getFirstName());//ascending order
				//return e2.getFirstName().compareTo(e1.getFirstName());//descending order
			}
		});
		*/
		//using lambda express
		//Collections.sort(list, (e1,e2) -> e1.getAge() - e1.getAge());//insertion order
		//Collections.sort(list, (e1,e2) -> e2.getAge() - e2.getAge());//insertion order
		
		//Collections.sort(list,(e1,e2) -> e1.getAge() - e2.getAge());//ascending order
		//Collections.sort(list, (e1,e2) -> e2.getAge() - e1.getAge() );//descending order
		
		//Collections.sort(list, (e1,e2) -> e1.getFirstName().compareTo(e1.getFirstName()));//insertion order
		//Collections.sort(list, (e1,e2) -> e2.getFirstName().compareTo(e2.getFirstName()));////insertion order
		
		//Collections.sort(list, (e1,e2) -> e1.getFirstName().compareTo(e2.getFirstName()));//ascending order
		//Collections.sort(list, Comparator.comparing(Employee::getFirstName));//ascending order
		//Collections.sort(list, (e1,e2) -> e2.getFirstName().compareTo(e1.getFirstName()));//descending order
		//System.out.println(list);
		
		//Method Reference (::)
		//DoubleColon dc = Test::display;
		//DoubleColon dc = new Test()::print;
//		Test t = new Test();
//		DoubleColon dc = t::print;
//		dc.show();
		
		
		//lambda expression use as argument
		//Test.result(50, 10, (a,b) -> (a*b));
		
		/*
		Predicate<Employee> p = x -> x.getAge() > 30;
		for(Employee e:list) {
			if(p.test(e)) {
				System.out.println(e);
				System.out.println(e.getFirstName());
			}
		}
		*/
		/*
		List<Employee>list2 = list.stream()
		.filter(x -> x.getAge() > 30)
		.collect(Collectors.toList());
		System.out.println(list2);
		*/
		
		/*
		list.stream()
		.filter(x->x.getAge()<30)
		.forEach(System.out::println);
		*/
		
		//IntStream.range(1, 6).forEach(System.out::println);
		//IntStream num = IntStream.iterate(2, x -> x+1);
		//num.limit(5).forEach(x->System.out.println(x));
		
	 long length =Stream.of(1,2,4)
		.filter(x -> x >0)
		.count();
	 System.out.println(length);
	 
//	 long count = Stream.of("Java","JavaScript","Angular","Python")
//			 .filter(x -> x.contains("J"))
//			 .map(String:: toUpperCase)
//			 .count();
//	 System.out.println(count);
	 
	 /*
	 Stream.of("Java","JavaScript","Angular","Python")
			 .filter(x -> x.contains("J"))
			 // .map(String:: isEmpty)
			 .map(String:: toUpperCase)
			 
			 .forEach(System.out::println);
			 
	 Stream.generate(Math::random).limit(4).forEach(System.out::println);;
	 */
	 
//	 System.out.println( list.stream()
//	 .collect(Collectors.toMap(Employee::getFirstName, Employee::getLastName))
//	 );
	 
//	 Map<String,List<Employee>> map = new HashMap<>();
//	 list.stream().forEach(e -> {
//		 map.computeIfAbsent(e.getFirstName(), x -> new ArrayList<Employee>())
//		 .add(e.getAge());
//	 });
//	 System.out.println(map);
	 
	 List<String>list1 = Arrays.asList("A","B");
	 List<String>list2 = Arrays.asList("C","D","E");
	 List<String>list3 = Arrays.asList("F","G");
	 
	 System.out.println(
			 Stream.of(list1,list2,list3)
			 .flatMap(List::stream)
			 .collect(Collectors.toList())
			 
			 );
	 
//	 Map<String,List<Integer>>map = new LinkedHashMap<>();
//	 map.put("one", Arrays.asList(1,2,3));
//	 map.put("two", Arrays.asList(4,5,6));
//	 System.out.println(
//	  map.values().stream()
//	 .flatMap(List:: stream)
//	 .collect(Collectors.toList()));
	
	 /*
	 List<Map<String,Integer>> listMap = new ArrayList<>();
	 
	 Map<String,Integer>map1 = new HashMap<>();
	 map1.put("one", 23);
	 map1.put("two", 24);
	 
	 
	 Map<String,Integer>map2 = new HashMap<>();
	 map2.put("one", 26);
	 map2.put("two", 27);
	 
	 listMap.add(map1);
	 listMap.add(map2);
	 
	 System.out.println(
	  listMap.stream()
	  .map(Map::values)
	 .flatMap(Collection:: stream)
	 .collect(Collectors.toList()));
	 
	 */
	 
//	 List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//	 values.stream()
//	 .parallel()
//	 .forEach(System.out::println);
	 
//	 List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//	 values.parallelStream()
//	 .forEach(System.out::println);

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
class Test{
	public static void display() {
		System.out.println("Hi from display()");
	}
	public void print() {
		System.out.println("Hi from print()");
	}
	public static void result(int a,int b,Operation obj) {
		System.out.println(obj.opt(a, b));
	}
}
interface DoubleColon{
	void show();
}
interface Operation{
	public int opt(int a,int b);
}
