package java8.default_method;

interface Left{
	int a=10;
	default void m1() {
		System.out.println("Left Default Method"+a);
	}
}

interface Right{
	default void m1() {
		System.out.println("Right Default Method");
	}
}

class Test implements Left,Right{
	@Override
	public void m1() {
		//System.out.println("my own implementation");
		Left.super.m1();
		Right.super.m1();
	}
}
public class MultipleInterfaceWithDefaultMethod {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
