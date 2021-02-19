package spring5.di.setter_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		//without spring DI
//		Student student = new Student();
//		student.studentName = "Chaman Bharti";
//		student.displayStudentInfo();
		
//		Student student = new Student();
//		student.setStudentName("Chaman Bharti");
//		student.displayStudentInfo();
		
		//with spring DI using setter getter
//		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
//		Student student = (Student)context.getBean("student");
//		student.displayStudentInfo();
//		
//		Student student2 = context.getBean("student2",Student.class);
//		student2.displayStudentInfo();
		
		
		//constructor
//		Student student3 = new Student(1, "chaman");
//		student3.displayStudentInfo();
//		
		//with spring DI using constructor
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		
		Student student4 = context.getBean("student",Student.class);
		student4.displayStudentInfo();
	}
}
