package java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student>al = new ArrayList<>();
		populate(al);
		Function<Student, String> f = s->{
			int marks=s.marks;
			if(marks >= 80) {
				return "A[Dictinction]";
			}else if(marks >= 60) {
				return "B[First Class]";
			}else if(marks >= 50) {
				return "C[Second Class]";
			}else if(marks >= 35) {
				return "D[Third Class]";
			}else {
				return "E[Failed]";
			}
		};
		
		Predicate<Student> p = s->s.marks>=60;
		
		for(Student s:al) {
			if(p.test(s)) {
			System.out.println("Student Name:"+s.name);
			System.out.println("Student Marks:"+s.marks);
			System.out.println("Student Grade:"+f.apply(s));
			System.out.println();
			}
		}
	}

	private static void populate(ArrayList<Student> l) {
		l.add(new Student("Sunny", 100));
		l.add(new Student("Bunny",65));
		l.add(new Student("Chinny",55)); 
		l.add(new Student("Vinny",45));
		l.add(new Student("Pinny",25));
	}

}
