package java8.sam;

interface B{
	public int squareIt(int x);
}

class BImpl implements B{

	@Override
	public int squareIt(int x) {
		return x*x;
	}
	
}

public class SAM1 {

	public static void main(String[] args) {
		
		//without lambda
//		B b = new BImpl();
//		System.out.println(b.squareIt(4));
//		System.out.println(b.squareIt(5));
		
		//with lambda
//		B b1 = (int x) -> {
//			return x*x;
//		};
		B b1 = (int x) -> x * x;
		System.out.println(b1.squareIt(4));
		System.out.println(b1.squareIt(5));
	}
}
