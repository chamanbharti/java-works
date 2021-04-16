package interview.company;

public class StaticTest {

	static {
		System.out.println("1. Static Block");
	}
	
	 {
		System.out.println("2. Instance Block");
	}
	
	StaticTest(){
		System.out.println("3. Constructor");
	}
	
	void m1() {
		System.out.println("4. m1()");
	}
	
	public static void main(String[] args) {
		StaticTest t = new StaticTest();
		t.m1();
	}
}
