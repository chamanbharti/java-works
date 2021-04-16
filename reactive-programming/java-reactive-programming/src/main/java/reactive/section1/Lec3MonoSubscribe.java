package reactive.section1;

import reactive.util.Util;
import reactor.core.publisher.Mono;

public class Lec3MonoSubscribe {

	public static void main(String[] args) {
		
		//publisher
		System.out.println("using subscribe");
		
		Mono<Integer>mono = Mono.just(1);
		System.out.println(mono);
		//mono.subscribe(i -> System.out.println("Received:"+i));
		mono.subscribe(Util.onNext());
		
		System.out.println("using all methods of subscribe");
		
		Mono<String>mono2 = Mono.just("ball");
		mono2.subscribe(
				/*
				 item -> System.out.println(item),
				 err -> System.out.println(err.getMessage()),
				 () -> System.out.println("Completed")
				 */
				Util.onNext(),
				Util.onError(),
				Util.onComplete()
				);
		
		System.out.println("using onError method of subscribe");
		Mono<Integer>mono3 = Mono.just("ball")
				.map(String::length)
				.map(l -> l / 0);
		
		mono3.subscribe(
				/*
				 item -> System.out.println(item),
				 err -> System.out.println(err.getMessage()),
				 () -> System.out.println("Completed")
				 */
				Util.onNext(),
				Util.onError(),
				Util.onComplete()
				);
		
	}
}
