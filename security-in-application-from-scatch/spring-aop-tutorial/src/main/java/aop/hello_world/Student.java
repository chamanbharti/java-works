package aop.hello_world;

import org.springframework.stereotype.Component;

@Component
public class Student {

	//without aop I
//	public void study() {  //I
//		System.out.println("I am in school and studying right now!");
//	}
	
//	public void study() {  //II
//		new Human().wakeup();
//		System.out.println("I am in school and studying right now!");
//	}
	
	
	//with aop
//	public void study() {
//		System.out.println("I am in school and studying right now!");
//	}
	
	// using wildcard & return type should be same
//	public void studyAnything() {
//		System.out.println("I am in school and studying right now!");
//	}
		
	// using wildcard & return may be any
//	public int studyAnything() {
//		//new Human().wakeup();
//		System.out.println("I am in school and studying right now!");
//		return 0;
//	}
	

//	public int studyAnything(int x, int y) {
//		System.out.println("I am in school and studying right now!");
//		return 0;
//	}
	
	//afterReturning
//	public int studyAnything(int x, int y) {
//		System.out.println("I am in school and studying right now!");
//		return 500;
//	}
//	
//	public String doOperation() {
//		 throw new MyException("This is my exception!!");
//	   }
	
	public int rankOfVideo(int noOfViews, int watchTime) {
		System.out.println("This is rank method....noOfViews:"+noOfViews+" watchTime:"+watchTime);
		return (noOfViews * watchTime) - (noOfViews + watchTime);
	}
}
