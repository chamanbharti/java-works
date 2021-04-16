package reactive.section1;

import reactive.util.Util;
import reactor.core.publisher.Mono;

public class Lec2MonoJust {

	public static void main(String[] args) {
		
		//publisher
		System.out.println("using subscribe");
		
		Mono<Integer>mono = Mono.just(1);
		System.out.println(mono);
		//mono.subscribe(i -> System.out.println("Received:"+i));
		mono.subscribe(Util.onNext());
		
	}
}
