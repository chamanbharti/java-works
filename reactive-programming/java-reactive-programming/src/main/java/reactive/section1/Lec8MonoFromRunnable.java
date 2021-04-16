package reactive.section1;

import reactive.util.Util;
import reactor.core.publisher.Mono;

public class Lec8MonoFromRunnable {

	public static void main(String[] args) {
		
//		Runnable runnable = () -> System.out.println("");
//		Mono.fromRunnable(runnable)
//		.subscribe(Util.onNext(),
//					Util.onError(),
//					Util.onComplete()
//				);
		
		Mono.fromRunnable(timeConsumingProcess())
		.subscribe(
				Util.onNext(),
				Util.onError(),
				() -> {
						System.out.println("Process is done. Sending emails...");
					}
				);
	}
	private static Runnable timeConsumingProcess() {
		return () -> {
			Util.sleepSeconds(3);
			System.out.println("Operation completed");
		};
	}
}
