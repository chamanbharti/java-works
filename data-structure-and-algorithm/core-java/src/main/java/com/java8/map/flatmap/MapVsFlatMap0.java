package java8.map.flatmap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//https://www.baeldung.com/java-flatten-nested-collections
public class MapVsFlatMap0 {

	public static void main(String[] args) throws FileNotFoundException { 
		
		
		List<String>list = Stream.of("a","b")
//				.map(String::toUpperCase)
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(list);
		//assertEquals(asList("A","B"),list);
		
		List<List<String>>list2 = Arrays.asList(
				Arrays.asList("a"),
				Arrays.asList("b")
				);
		System.out.println(list2);
		System.out.println(
				list2.stream()
//				.flatMap(Collection::stream)
//				.flatMap(c->c.stream())
//				.flatMap(c->c.stream().map(d->d.toUpperCase()))
//				.flatMap(c->c.stream().map(String::toUpperCase))
				.flatMap(c->c.stream())
//				.map(d->d.toUpperCase())
				.map(String::toUpperCase)
				.collect(Collectors.toList())
				);
    } 
}
