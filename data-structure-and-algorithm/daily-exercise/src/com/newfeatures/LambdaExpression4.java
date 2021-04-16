package com.newfeatures;

/*class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}*/

public class LambdaExpression4 {

	public static void main(String[] args) {
		
		
		//MyRunnable r = new MyRunnable();
		//Thread t = new Thread(r);
		
		//using anonymous class
//		Runnable r = new Runnable {
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println("Child Thread");
//				}
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
		
		//using lambda expression
		Runnable r = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		
	}
}
