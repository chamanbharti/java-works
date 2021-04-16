package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
class Person {
	int id;
	String name;
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class StreamPractice {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person(1, "Rahi"),
				new Person(2, "Saima"),
				new Person(3, "Ryaan"),
				new Person(4, "Ayaan")
				);
		Stream<Person> stream = persons.stream();
		//stream.forEach(p -> System.out.print(p));
		stream.forEach(System.out::println);
		
	}

}
