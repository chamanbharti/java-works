package java8.completableFuture;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

	private static int data=5;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("in main thread data is :"+data);
		CompletableFuture.runAsync( ()->{
			try {
				  Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data = 10;
		});
		System.out.println("main thread");
		System.out.println("data not changed as completable future in progress "+data);
		Thread.sleep(2500);
		System.out.println("data changed by completable future >>"+data);
	}
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		
//		System.out.println(new Date());
//		CompletableFuture<String>data = CompletableFuture.supplyAsync( () ->{
//			try {
//				 Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			return "data from supplyAsync() !!!!";
//		});
//		System.out.println(data.get());//wait till thread executes
//		System.out.println(new Date());
//		System.out.println("main thread");
//		
//	}
	
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		
//		System.out.println(new Date());
//		CompletableFuture<String>data = CompletableFuture.supplyAsync( () ->{
//			try {
//				 Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			return "data from supplyAsync() !!!!";
//		});
//		System.out.println("data before sleep --->"+data);
//		Thread.sleep(2500);
//		System.out.println("new data ->"+data);
//		System.out.println(new Date());
//	}
}
