package java8.sam;
/**
 * 
 *  Case 1
 *  If an interface extends FI and child interface does not contain any abstract method,
 *  then  child interface is always FI
 *
 */
//@FunctionalInterface
//interface P {
//	public void m1();
//}
//@FunctionalInterface
//interface C extends P {
//}
//
//public class SAM_is_a {
//	public static void main(String[] args) {
//		System.out.println("This is valid");
//	}
//}

/**
 * 
 *  Case 2
 *  In the child interface, we can define exactly same parent abstract method 
 *  does not contain any abstract method,
 *  then  child interface is always FI
 *
 */
//@FunctionalInterface
//interface P {
//	public void m1();
//}
//@FunctionalInterface
//interface C extends P {
//	public void m1();
//}
//
//public class SAM_is_a {
//	public static void main(String[] args) {
//		System.out.println("This is also valid");
//	}
//}

/**
 * 
 *  Case 3
 *  In the child interface, we can't define any new abstract methods otherwise we will get CE 
 *  does not contain any abstract method,
 *  then  child interface is always FI
 *
 */
//@FunctionalInterface
//interface P {
//	public void m1();
//}
//
//@FunctionalInterface
//interface C extends P {
//	public void m2();
//}
//
//public class SAM_is_a {
//	public static void main(String[] args) {
//		System.out.println("This is not valid");
//	}
//}

/**
 * 
 *  Case 4
 *  In the child interface, if we don't declare FI annotation then child is not FI
 *
 */
@FunctionalInterface
interface P {
	public void m1();
}

//@FunctionalInterface
interface C extends P {
	public void m2();
}

public class SAM_is_a {
	public static void main(String[] args) {
		System.out.println("This is valid");
	}
}