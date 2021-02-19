package java8.lambda;
interface interf{
	public void m1();
}
public class AnonymousClassThisKeyword {

	int x = 888;
	
	public void m2() {
//		interf i = new interf() {
//			int x = 999;//instance variable
//			public void m1() {
//				System.out.println(this.x);//999
//				System.out.println(x);//999
//			}
//		};
		
//		interf i = () -> {
//			int x = 999;
//				System.out.println(this.x);//888
//				System.out.println(x);//999
//		};
//		i.m1();
		int y=20;
		interf i = () -> {
				System.out.println(x);//888
				System.out.println(y);//20
				//y=30; //CE:
				x=40;
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		AnonymousClassThisKeyword obj = new AnonymousClassThisKeyword();
		obj.m2();
	}
	
}
