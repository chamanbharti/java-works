package com.learnreactivespring.fluxAndmono;
import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OperatorTest {

//	@Test
//	void map() {
//		Flux.range(1, 5)
//		.map(i -> i * 10)
//		.subscribe(System.out::println);
//		
//	}
	@Test
	void flatMap() {
		Flux.range(1, 5)
		.flatMap(i -> Flux.range(i*10, 2))
		.subscribe(System.out::println);
		
	}
	@Test
	void flatMapMany() {
		Mono.just(3)
		.flatMapMany(i->Flux.range(1, i))
		.subscribe(System.out::println);
		
	}
}
