package java8.default_method;

interface A{
	default void m1() {
		System.out.println("Default Method");
	}
}
//public class DefaultMethodTest implements A {
//
//	public static void main(String[] args) {
//		DefaultMethodTest obj = new DefaultMethodTest();
//		obj.m1();
//	}
//}

public class DefaultMethodTest implements A {

	@Override
	public void m1() {
		//A.super.m1();
		System.out.println("My own implementation");
	}
	public static void main(String[] args) {
		DefaultMethodTest obj = new DefaultMethodTest();
		obj.m1();
	}
}