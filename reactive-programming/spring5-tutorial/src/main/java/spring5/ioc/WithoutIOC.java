package spring5.ioc;

class Calculator {
//	public int sum(int a,int b) {
//		return 2+3;// Calculator has control of sum
//	}
	
	public int sum(int a,int b) {
		return a+b;// Calculator has no control of sum
	}
}
public class WithoutIOC {

	public static void main(String[] args) {
//		System.out.println(new Calculator().sum(20,30)); // WithoutIOC has no control of sum
		System.out.println(new Calculator().sum(20,30)); // WithoutIOC has control of sum
		
	}
}
