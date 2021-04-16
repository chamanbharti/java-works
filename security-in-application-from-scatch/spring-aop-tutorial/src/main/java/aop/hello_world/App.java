package aop.hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Student student = context.getBean("student", Student.class); 
//		//call before study() without aop I
//		new Human().wakeup();
//		student.study();
		
//		//call before study() without aop II
//		student.study();
		
		
		//call before study() with aop
		//student.study();
		
		
//		Student student = context.getBean("student", Student.class);
//		student.study();
//		Employee employee = context.getBean("employee", Employee.class);
//		employee.study();
//		context.close();
		
//		Student student = context.getBean("student", Student.class);
//		student.study();
//		Employee employee = context.getBean("employee", Employee.class);
//		employee.study();
//		context.close();
		
		//using wildcard operator
//		Student student = context.getBean("student", Student.class);
//		student.studyAnything();
//		Employee employee = context.getBean("employee", Employee.class);
//		employee.studySomething();
//		context.close();
		
//		Student student = context.getBean("student", Student.class);
//		//jointpoint(before)
//		student.studyAnything();
//		//jointpoint(after)
		
//		Employee employee = context.getBean("employee", Employee.class);
//		//jointpoint(before)
//		employee.studySomething();
//		//jointpoint(after)
//		context.close();
		
//		Student student = context.getBean("student", Student.class);
//		//jointpoint(before)
//		student.studyAnything(5,5);
//		//jointpoint(after)
		
//		Employee employee = context.getBean("employee", Employee.class);
//		//jointpoint(before)
//		employee.studySomething();
//		//jointpoint(after)
//		context.close();
		
		//afterReturning
//		Student student = context.getBean("student", Student.class);
//		//jointpoint(before)
//		int val = student.studyAnything(5,45);
//		System.out.println("Return Value:"+val);
//		//student.doOperation();
//		//jointpoint(after)
		
		Student student = context.getBean("student", Student.class);
		int rank = student.rankOfVideo(100, 65);
		System.out.println("Video Ranking Position is:"+rank);
		
//		Operation opt = context.getBean(Operation.class);
//		opt.sum(45, 5);
		
	}
}