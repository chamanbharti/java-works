package reactive.section2;

import reactive.util.Util;
import reactor.core.publisher.Flux;

public class Lec1FluxIntro {
	
	public static void main(String[] args) {
		
//	 	Flux<Integer>flux = Flux.just();
//	 	flux.subscribe(
//	 			Util.onNext(),
//	 			Util.onError(),
//	 			Util.onComplete());
		
//		Flux<Integer>flux = Flux.just(1);
//	 	flux.subscribe(
//	 			Util.onNext(),
//	 			Util.onError(),
//	 			Util.onComplete());
		
//		Flux<Integer>flux = Flux.just(1,2,3,4,5);
//	 	flux.subscribe(
//	 			Util.onNext(),
//	 			Util.onError(),
//	 			Util.onComplete());
		
//		Flux<Integer>flux = Flux.empty();
//	 	flux.subscribe(
//	 			Util.onNext(),
//	 			Util.onError(),
//	 			Util.onComplete());
		
		Flux<Object>flux = Flux.just(1,2,3,"a",Util.faker().name().fullName());
		
	 	flux.subscribe(
	 			Util.onNext(),
	 			Util.onError(),
	 			Util.onComplete());
	}
}
