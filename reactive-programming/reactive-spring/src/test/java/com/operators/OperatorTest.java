package com.operators;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OperatorTest {

//	@Test
//	void map(){
//		Flux.range(1, 5)
//		.log()
//		.map(i -> i * 10)
//		.subscribe(
//					System.out::println
//				);
//	}
	
//	@Test
//	void flatMap(){
//		Flux.range(1, 5)
//		.log()
//		.flatMap(i -> Flux.range(i*10, 2))
//		.subscribe(
//					System.out::println
//				);
//	}
	
//	@Test
//	void flatMapMany(){
//		Mono.just(3)
//		.log()
//		.flatMapMany(i -> Flux.range(1, i))
//		.subscribe(System.out::println);
//	}
	
//	@Test
//	void concat() throws InterruptedException{
//		Flux<Integer>oneToFive = Flux.range(1, 5)
//				.delayElements(Duration.ofMillis(200));
//		
//		Flux<Integer>sixToTen = Flux.range(6, 5)
//				.delayElements(Duration.ofMillis(400));
////		Flux.concat(oneToFive, sixToTen)
////		.subscribe(System.out::println);
//		
//		oneToFive.concatWith(sixToTen)
//		.log()
//		.subscribe(System.out::println);	
//		Thread.sleep(4000);
//	}
	
//	@Test
//	void concat() throws InterruptedException{
//		Flux<Integer>oneToFive = Flux.range(1, 5)
//				.delayElements(Duration.ofMillis(200));
//		
//		Flux<Integer>sixToTen = Flux.range(6, 5)
//				.delayElements(Duration.ofMillis(400));
////		Flux.concat(oneToFive, sixToTen)
////		.subscribe(System.out::println);
//		
//		oneToFive.concatWith(sixToTen)
//		.log()
//		.subscribe(System.out::println);	
//		Thread.sleep(4000);
//	}
	
	@Test
	void zip() {
		Flux<Integer>oneToFive = Flux.range(1, 5);
		
		Flux<Integer>sixToTen = Flux.range(6, 5);
		
//		Flux.zip(
//				oneToFive,sixToTen,
//				(item1,item2) -> item1 + ","+item2
//				)
		
		oneToFive.zipWith(sixToTen)
		//.log()
		.subscribe(System.out::println);	
	}
}
