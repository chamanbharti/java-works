package java8.lambda;

public class AnonymousVsLambda {
	public static void main(String[] args) {
		
		//without lambda
//		Runnable r = new Runnable() {
//			public void run() {
//				for(int i=0;i<5;i++) {
//					System.out.println("Child Thread");
//				}
//			}
//		};
		
		//with lambda
//		Runnable rr = () -> {
//			for(int i=0;i<5;i++) {
//				System.out.println("Child Thread");
//			}
//		};
//		Thread t = new Thread(rr);
//		t.start();
		
		
		Thread t = new Thread( () ->  {
								for(int i=0;i<5;i++) {
									System.out.println("Child Thread");
								}
		                     });
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
