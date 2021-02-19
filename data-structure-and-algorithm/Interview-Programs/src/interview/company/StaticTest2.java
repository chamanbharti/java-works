package interview.company;

public class StaticTest2 {

	static int count;
	
	static int m1() {
		return ++count;
	}
	
	public static void main(String[] args) {
		System.out.println(m1());
		//int no=m1();
		//System.out.println(no);
	}
}
