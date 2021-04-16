package java8.sam;

//@FunctionalInterface
//interface Interf{
//	public abstract void m1() ;
//		default void m2() {
//			System.out.println("hello");
//		}
//}

//This code gives compilation error.
//@FunctionalInterface
//interface Interf{
//	public void m1() ;
//	public void m2() ;
//}

//compilation error
//@FunctionalInterface
//interface Interf{
//}

//Functional Interface with respect to Inheritance
//@FunctionalInterface
//interface A{
//	public void methodOne();
//}
//@FunctionalInterface
//interface B extends A{
//	public void methodOne();
//}

////Compiletime Error
//@FunctionalInterface
//interface A{
//	public void methodOne();
//}
//@FunctionalInterface
//interface B extends A{
//	public void methodTwo();
//}

//No Compiletime Error
//@FunctionalInterface
//interface A{
//	public void methodOne();
//}
//
//interface B extends A{
//	public void methodTwo();//This’s Normal interface so that code compiles without error
//}
//
////Without Lambda Expression
//interface A{
//	public void methodOne();
//}
//class Demo implements A{
//	@Override
//	public void methodOne() {
//		System.out.println("method one execution");
//	}
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		A a = new Demo();
//		a.methodOne();
//	}
//}


//With Lambda Expression
//interface A{
//	public void methodOne();
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		A a = () -> System.out.print("method one execution");
//		a.methodOne();
//	}
//}

////WithoutLambda Expression
//interface A{
//	public void sum(int a,int b);
//}
//class Demo implements A{
//	@Override
//	public void sum(int a, int b) {
//		System.out.println("The Sum:"+(a+b));
//	}
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		A a = new Demo();
//		a.sum(10,50);
//	}
//}

//With Lambda Expression
//interface A{
//	public void sum(int a,int b);
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		A obj = (int a,int b) -> System.out.print("The sum:"+(a+b));
//		obj.sum(10,50);
//	}
//}

//Without Lambda Expression
//interface A{
//	public int square(int x);
//}
//class Demo implements A{
//
//	@Override
//	public int square(int x) {
//		return x*x;
//	}
//	
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		A obj = new Demo();
//		System.out.println("The square of is:"+obj.square(5));;
//	}
//}

////With Lambda Expression
//interface A{
//	public int square(int x);
//}
//class Demo implements A{
//
//	@Override
//	public int square(int x) {
//		return x*x;
//	}
//	
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		A obj = (x)-> x*x;
//		System.out.println("The square of is:"+obj.square(5));
//	}
//}


////With Anonymous inner class 1
////@FunctionalInterface
////interface Runnable {
////	public abstract void run();
////}
//public class FIDemo {
//	public static void main(String[] args) {
//		Runnable r = new Runnable() {
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println("Child Thread");
//				}
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for(int i=0;i<10;i++) {
//			System.out.println("Main Thread");
//		}
//	}
//}
//With Lambda Expression
//@FunctionalInterface
//interface Runnable {
//	public abstract void run();
//}
//public class FIDemo {
//	public static void main(String[] args) {
//		Runnable r = ()->{
//			for(int i=0;i<10;i++) {
//				System.out.println("Child Thread");
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for(int i=0;i<10;i++) {
//			System.out.println("Main Thread");
//		}
//	}
//}

////With Anonymous inner class 2
////@FunctionalInterface
////interface Runnable {
////public abstract void run();
////}
//public class FIDemo {
//public static void main(String[] args) {
//
//	Thread t = new Thread(new Runnable() {
//		public void run() {
//			for(int i=0;i<10;i++) {
//				System.out.println("Child Thread");
//			}
//		}
//	});
//	t.start();
//	for(int i=0;i<10;i++) {
//		System.out.println("Main Thread");
//	}
//}
//}


////With Anonymous inner class 2
////@FunctionalInterface
////interface Runnable {
////public abstract void run();
////}
//public class FIDemo {
//public static void main(String[] args) {
//
//	Thread t = new Thread(new Runnable() {
//		public void run() {
//			for(int i=0;i<10;i++) {
//				System.out.println("Child Thread");
//			}
//		}
//	});
//	t.start();
//	for(int i=0;i<10;i++) {
//		System.out.println("Main Thread");
//	}
//}
//}

//////With Lambda expression
//////@FunctionalInterface
//////interface Runnable {
//////public abstract void run();
//////}
//public class FIDemo {
//public static void main(String[] args) {
//
//	Thread t = new Thread( () -> {
//			for(int i=0;i<10;i++) {
//				System.out.println("Child Thread");
//			}
//	});
//	t.start();
//	for(int i=0;i<10;i++) {
//		System.out.println("Main Thread");
//	}
//}
//}


//interface Interf {
//	public void m1();
//}
//public class FIDemo {
//	int x = 777;
//	public void m2() {
//		Interf i = () -> {
//			int  x = 888;
//			System.out.println(x);//888
//			System.out.println(this.x);//777
//		};
//		i.m1();
//	}
//	public static void main(String[] args) {
//		FIDemo obj = new FIDemo();
//		obj.m2();
//	}
//}
//

interface Interf {
	public void m1();
}
public class FIDemo {
	int x = 10;
	public void m2() {
		int  y = 20;
		Interf i = () -> {
			System.out.println(x);//10
			System.out.println(y);//20
			x=888;
			//y=999; //CE
		};
		i.m1();
		//y=777;
	}
	public static void main(String[] args) {
		FIDemo obj = new FIDemo();
		obj.m2();
	}
}


