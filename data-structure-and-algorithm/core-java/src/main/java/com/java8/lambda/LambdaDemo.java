package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.8 features
 * 
 * 1. To simplify the programming
 * 2. To utilize functional programming benefit in java
 * 3. To enable parallel processing in java
 *
 */

//// withoug lambda expression
//interface Hello {
//
//	  void m();
//
//	}
//
//// Step 1
//class HelloImpl implements Hello{
//	@Override
//	public void m() {
//		System.out.println("Hello lambda");
//		
//	}
//	
//}
//public class LambdaDemo {
//	
//	 public static void main(String[] args) {
//		 HelloImpl obj = new HelloImpl();
//       Hello obj = new HelloImpl(); // it is polymorphism
//		 obj.m();
//	}
//	 
//}

//with anonymous class
//interface Hello {
//
// void m();
//
//}

//Step 2

//public class LambdaDemo {
//
//public static void main(String[] args) {
//	
//  Hello obj = new Hello() {
//	@Override
//	public void m() {
//		System.out.println("Hello");
//	  }
//   };
//	obj.m(); 
//	 List<String> list=new ArrayList<String>();  
//     list.add("ankit");  
//     list.add("mayank");  
//     list.add("irfan");  
//     list.add("jai");
//     list.forEach(action->System.out.println(action));
//}
//
//}


//with lambda expression
//interface Hello {
//
//	  //void m();
//	//void add(int a,int b);
//	int getLength(String s);
//
//	}
//
////Step 2
//
//public class LambdaDemo {
//	
//	 public static void main(String[] args) {
//		 
////		 Hello h = () -> {
////		 System.out.println("Hello");
////		 };
////		 h.m(); //Hello
////		 Hello h1 = () -> System.out.println("Hello");
////		 h1.m(); //Hello
//		 
////		 Hello h = (int a,int b) -> System.out.println("The sum:"+(a+b));
////		 h.add(10, 20); //30
////		 h.add(100, 200);//300
//		 
//		 Hello h = (String s) -> {
//			 return s.length();
//		 };
//		 System.out.println("h:"+h.getLength("Chaman"));
//		 
//		 Hello h1 = (s) -> {
//			return s.length();
//		 };
//		 System.out.println("h1:"+h1.getLength("Chaman"));
//		 
//		 Hello h2 = (s) -> s.length();
//		 System.out.println("h2:"+h2.getLength("Chaman"));
//		 
//		 Hello h3 = s -> s.length();
//		 System.out.println("h4:"+h3.getLength("Chaman"));
//		 
//	}
//	 
//}

//with lambda expression
interface Hello {

	  void m();

	}


public class LambdaDemo {
	
	 public static void main(String[] args) {
		 
		 Hello h = () -> {
		 System.out.println("Hello");
		 };
		 h.m(); //Hello
		 Hello h1 = () -> System.out.println("Hello");
		 h1.m(); //Hello
		 
		 
		 
	}
	 
}
