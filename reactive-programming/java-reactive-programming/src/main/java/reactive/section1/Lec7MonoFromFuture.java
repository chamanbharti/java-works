package reactive.section1;

import java.util.concurrent.CompletableFuture;

import reactive.util.Util;
import reactor.core.publisher.Mono;

public class Lec7MonoFromFuture {
	
	public static void main(String[] args) {
		Mono.fromFuture(
				         getName()
				        ).subscribe(Util.onNext());
		
		Util.sleepSeconds(1);
	}
	private static CompletableFuture<String> getName(){
		return CompletableFuture.supplyAsync(
				()-> Util.faker().name().fullName()
				);
	}
}
