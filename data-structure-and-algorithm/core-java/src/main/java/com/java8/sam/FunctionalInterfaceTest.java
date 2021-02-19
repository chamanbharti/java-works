package java8.sam;



//This is not SAM because it has two abstract method
//@FunctionalInterface
//interface B{
//	public void m1();
//	
//	public  void m2();
//	
//	public static void m3() {
//		System.out.println("Static Method inside SAM");
//	}
//}

//This is SAM
//@FunctionalInterface //this annotation is optional
interface A{
	public void m1();
	
	public default void m2() {
		System.out.println("Default Method inside SAM");
	}
	public static void m3() {
		System.out.println("Static Method inside SAM");
	}
}

class Demo implements A{
	public void m1() {
		System.out.println("m1() implementation");
	}
}
public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		
		//without lambda
		A obj = new Demo();
		obj.m1();
		
		//with lambda
//		A a = () ->{
//		System.out.println("Hello Lambda");
//		};
//		a.m1();
		
		A a = () -> System.out.println("Hello Lambda");
		  a.m1();
	}
}
