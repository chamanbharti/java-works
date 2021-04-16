package reactive.section1;

import reactive.util.Util;
import reactor.core.publisher.Mono;

public class Lec4MonoEmptyOrError {

	public static void main(String[] args) {
		
		System.out.println("using Mono Empty Or Error");
		userRepository(20).subscribe(
				Util.onNext(),
				Util.onError(),
				Util.onComplete()
				);
		
	}
	private static Mono<String>userRepository(int userId){
		if(userId == 1) {
			return Mono.just(Util.faker().name().firstName());
		}else if(userId == 2) {
			return Mono.empty();// null
		}else {
			return Mono.error(new RuntimeException("Not in the allowed range"));
		}
	}
}
