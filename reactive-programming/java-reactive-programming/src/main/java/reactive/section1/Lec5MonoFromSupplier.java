package reactive.section1;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

import reactive.util.Util;
import reactor.core.publisher.Mono;

public class Lec5MonoFromSupplier {

	public static void main(String[] args) {
		
		// use just only when you have data already
		//Mono<String>mono = Mono.just(getName());
		// if u run without subscribe it  will print
		// Generating name...
		
//		mono.subscribe(
//				Util.onNext()
//				);
		
//		Mono<String>mono2 = Mono.fromSupplier( ()-> getName());
//		mono2.subscribe(
//				 Util.onNext()
//				);
		
		Supplier<String>stringSupplier = () -> getName();
		Mono<String>mono2 = Mono.fromSupplier( stringSupplier);
		mono2.subscribe(
				 Util.onNext()
				);
		
		Callable<String>stringCallable = () -> getName();
		Mono<String>mono3 = Mono.fromCallable( stringCallable);
		mono3.subscribe(
				 Util.onNext()
				);
	}
	private static String getName() {
		System.out.println("Generating name...");
		return Util.faker().name().fullName();
	}
}
