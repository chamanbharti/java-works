package java8.imperativeVsDeclarative;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDeclarative2 {

	public static void main(String[] args) {
		
		List<Person> people = List.of(
				 new Person("Rahi", Gender.MALE),
				 new Person("Saima", Gender.FEMALE),
				 new Person("Ryaan", Gender.MALE)
				);
		System.out.println("Imperative Approach");
		List<Person> females = new ArrayList<>();
		for(Person person: people) {
			if(Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		for(Person female: females) {
			System.out.println(female);
		}
		
		System.out.println("Declarative Approach");
		List<Person> people2 = people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
				.collect(Collectors.toList());
		people2.forEach(System.out::println);
		
	}
	
	static class Person {
		private final String name;
		private final Gender gender;
		Person(String name, Gender gender){
			this.name = name;
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
	}
	enum Gender {
		MALE, FEMALE
	}
}
