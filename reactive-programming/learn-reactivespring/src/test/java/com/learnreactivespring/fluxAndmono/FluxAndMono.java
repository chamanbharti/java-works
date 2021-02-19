package com.learnreactivespring.fluxAndmono;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMono {
	

//	@Test
//	public void fluxTest() {
//		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring");
//		stringFlux.log().subscribe(System.out::println);
//      }		
//		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")));
//		stringFlux.subscribe(System.out::println,
//				(e) -> System.err.println(e));
		
//		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.log();
//		stringFlux.subscribe(System.out::println,
//				(e) -> System.err.println("Exception is "+e));
		
//		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.concatWith(Flux.just("After Error"))
//				.log();
//		stringFlux.subscribe(System.out::println,
//				(e) -> System.err.println("Exception is "+e));
		
//		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.concatWith(Flux.just("After Error"))
//				.log();
//		stringFlux.subscribe(
//				System.out::println,
//				(e) -> System.err.println("Exception is "+e),
//				() -> System.out.println("Completed")
//				);
		
//		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				//.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.concatWith(Flux.just("After Error"))
//				.log();
//		stringFlux.subscribe(
//				System.out::println,
//				(e) -> System.err.println("Exception is "+e),
//				() -> System.out.println("Completed")
//				);
//	}
//	@Test
//	public void fluxTestElements_WithoutError() {
//		Flux<String>stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.log();
//		StepVerifier.create(stringFlux)
//		.expectNext("Spring")
//		.expectNext("Spring Boot")
//		.expectNext("Reactive Spring")
//		.verifyComplete();
//		
//	}
//	@Test
//	public void fluxTestElements_WithoutError() {
//		Flux<String>stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.log();
//		StepVerifier.create(stringFlux)
//		.expectNext("Spring")
//		.expectNext("Spring Boot")
//		.expectNext("Reactive Spring")
//		.expectError(RuntimeException.class)
//		.verify();
//		
//	}
//	@Test
//	public void fluxTestElements_WithoutError() {
//		Flux<String>stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.log();
//		StepVerifier.create(stringFlux)
//		.expectNext("Spring","Spring Boot","Reactive Spring")
//		.expectErrorMessage("Exception Occured")
//		.verify();
//		
//	}
//	@Test
//	public void fluxTestElementsCount_WithoutError() {
//		Flux<String>stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//				.concatWith(Flux.error(new RuntimeException("Exception Occured")))
//				.log();
//		StepVerifier.create(stringFlux)
//		.expectNextCount(3)
//		.expectErrorMessage("Exception Occured")
//		.verify();
//		
//	}
//	@Test
//	public void monoTest() {
//		Mono<String> stringMono = Mono.just("Spring");
//		StepVerifier.create(stringMono.log())
//		.expectNext("Spring")
//		.verifyComplete();
//	}
//	@Test
//	public void monoTest_Error() {
//		StepVerifier.create(Mono.error(new RuntimeException("Exception occured")).log())
//		
//		.expectError(RuntimeException.class)
//		.verify();
//	}
	
//	@Test
//	public void monoTest() {
//		Mono.just("A")
//        .log()
//        .subscribe(System.out :: println);
//	}
	
//	@Test
//	public void MapTest() {
//		Flux.just(1,5,10).map(num -> num*10).subscribe(System.out::println);
//	}
	
	@Test
	public void FlatMapTest() {
		Flux.just(1,5,10).log().flatMap(num -> Flux.just(num*10)).subscribe(System.out::println);
	}
}
