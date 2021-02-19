package java8.streams.transformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//https://javaconceptoftheday.com/differences-between-java-8-map-and-flatmap/
//javarevisited.blogspot.com/2016/03/difference-between-map-and-flatmap-in-java8.html#ixzz6LLhfUXnK
public class MapVsFlapMap {
	public static void main(String[] args) {
		
		
		//step 1
		//the function you pass to map() operation returns a single value
		List<Integer> listOfInteger = Stream.of("1", "2", "3", "4").map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("map list:"+listOfInteger);
		List<Integer> evens = Arrays.asList(2, 4, 6); 
		List<Integer> odds = Arrays.asList(3, 5, 7); 
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
		
		List<Integer> numbers = Stream.of(evens,odds,primes).flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println("flattend list:"+numbers);	
		
		//map() takes Stream<T> as input and return Stream<R> 
		
		List<Institute> instituteList = new ArrayList<>();
        
		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
		//Java 8 Map() : Get names of all institutes
		List<String> namesOfInstitutes = instituteList.stream().map(Institute::getName).collect(Collectors.toList());
		System.out.println(namesOfInstitutes);
		
		//flatMap() takes Stream<Stream<T> as input and return Stream<R> i.e flatmap() removes extra layer of nesting around input values.
		Set<String> namesOfInstitutes2 = instituteList.stream().flatMap(institute->institute.getState().stream()).collect(Collectors.toSet());
		System.out.println(namesOfInstitutes2);

	}
}
