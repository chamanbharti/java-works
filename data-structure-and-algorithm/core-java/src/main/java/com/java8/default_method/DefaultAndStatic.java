package java8.default_method;
interface Interface1{
	public static void getStaticMethod() {
		System.out.println("interface 1 --- static method");
	}
	public default void getDefaultMethod() {
		System.out.println("interface 1 --- default method");
	}
//	private void getPrivateMethod() {
//		System.out.println("interface 1 --- default method");
//	}
}
interface Interface2{
	public default void getDefaultMethod() {
		System.out.println("interface 2 --- default method");
	}
}
class ClassForDefault implements Interface1,Interface2{

	@Override
	public void getDefaultMethod() {
		// TODO Auto-generated method stub
		Interface2.super.getDefaultMethod();
	}
	
}
public class DefaultAndStatic {

	public static void main(String[] args) {
		//way to call static method in interface
		Interface1.getStaticMethod();
		
		//call default method of interface
		ClassForDefault obj = new ClassForDefault();
		obj.getDefaultMethod();
	}
}
