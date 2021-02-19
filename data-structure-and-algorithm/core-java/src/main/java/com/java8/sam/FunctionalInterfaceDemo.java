package java8.sam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Student
{
	int id;
	
	String name;
	
	double percentage;
	
	String specialization;
	
	public Student(int id, String name, double percentage, String specialization) 
	{
		this.id = id;
		
		this.name = name;
		
		this.percentage = percentage;
		
		this.specialization = specialization;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString()
	{
		return id+"-"+name+"-"+percentage+"-"+specialization;
	}
}
public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<Student>();
		
		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
				
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
				
		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
				
		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
				
		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
				
		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
				
		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
				
		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
				
		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
				
		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
		//Let’s see how to use 4 important functional interfaces – Predicate, Consumer, Function and Supplier using above listOfStudents.
//		List<Student>mathList = new ArrayList<>();
		
//		// I-a
//		for(Student student:listOfStudents) {
//			if(student.getSpecialization().equals("Mathematics")) {
//				mathList.add(student);
//			}
//		}
//		System.out.println(mathList);
		
//		// I-b
//		Predicate<Student> mathPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
//		for(Student student:listOfStudents) {
//			if(mathPredicate.test(student)) {
//				mathList.add(student);
//			}
//		}
//		System.out.println(mathList);
		
//		// I-c
//		Predicate<Student> mathPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
//		mathList = listOfStudents.stream().filter(mathPredicate).collect(Collectors.toList());
//		System.out.println(mathList);
		
//		// I-d
//		mathList = listOfStudents.stream().filter((Student math) -> math.getSpecialization().equals("Mathematics")).collect(Collectors.toList());
//		System.out.println(mathList);
		
		// II
//		Function<Student, String> nameFunction = (Student student) -> student.getName();
//		List<String> nameList = new ArrayList<>();
//		for(Student st:listOfStudents) {
//			nameList.add(nameFunction.apply(st));
//		}
//		System.out.println(nameList);
//		// II-b
//		listOfStudents.stream().forEach((Student t)-> nameList.add(nameFunction.apply(t)));
//		System.out.println(nameList);
		//III
//		Consumer<Student>percentageConsumer = (Student student) -> {
//			System.out.println("Student Name:"+student.getName()+":"+"Student Percentage:"+student.getPercentage());
//		};
//		//III-a
//		for(Student student:listOfStudents) {
//			percentageConsumer.accept(student);
//		}
//		//III-b
//		listOfStudents.stream().forEach(percentageConsumer);
		
		//IV
		Supplier<Student> studentSupplier = () -> new Student(1111, "New Student", 92.2, "Java 8");
		listOfStudents.add(studentSupplier.get());
		listOfStudents.forEach(System.out::println);
		
	}
	

}
