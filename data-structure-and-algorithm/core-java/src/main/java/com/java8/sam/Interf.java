package java8.sam;

public interface Interf {
	
	public void m1();
	
	default void m2() {
		
	}
	
	public static void m3() {
			
		}
	
	static void m4() {
		System.out.println();
	}
}
