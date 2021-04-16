package reactive.section1;

import reactive.util.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Lec6SupplierRefactoring {

	public static void main(String[] args) {
		
//		getName();
//		getName();
//		getName();
		
//		getName();
//		getName().subscribe(Util.onNext());//blocking(syn)
//		getName();
		
//		getName();
//		getName()
//		.subscribeOn(Schedulers.boundedElastic())
//		.subscribe(Util.onNext());//non-blocking(async)
//		getName();
		
//		getName();
//		getName()
//		.subscribeOn(Schedulers.boundedElastic())
//		.subscribe(Util.onNext());//non-blocking(async)
//		getName();
//		Util.sleepSeconds(3);
		
		
		// u can block() to use for testing
		getName();
	String name = getName()
		.subscribeOn(Schedulers.boundedElastic())
		.block();
	System.out.println(name);
		getName();
		Util.sleepSeconds(4);
	}
	private static Mono<String> getName() {
		System.out.println("entered getName method");
		return Mono.fromSupplier( ()->{
			System.out.println("Generating name..");
			Util.sleepSeconds(3);
			return Util.faker().name().fullName();
		}).map(String::toUpperCase);
	}
}
