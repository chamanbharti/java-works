package com.flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class FluxTest {

//	@Test
//	void firstFlux() {
//		Flux.just("A","B","C")
//		.log()
//		.subscribe();
//	}
//	
//	@Test
//	void fluxFromIterable1() {
//		Flux.just(Arrays.asList("A","B","C"))
//		.log()
//		.subscribe();
//	}
	
//	@Test
//	void fluxFromIterable2() {
//		Flux.fromIterable(Arrays.asList("A","B","C"))
//		.log()
//		.subscribe();
//	}
	
//	@Test
//	void fluxFromRange() {
//		Flux.range(10, 5)
//		.log()
//		.subscribe();
//	}
	
//	@Test
//	void fluxFromInterval() throws Exception {
//		Flux.interval(Duration.ofSeconds(1))
//		.log()
//		.subscribe();
//	}
	
//	@Test
//	void fluxFromInterval() throws Exception {
//		Flux.interval(Duration.ofSeconds(1))
//		.log()
//		.subscribe();
//		Thread.sleep(5000);
//	}
	
//	@Test
//	void fluxFromInterval() throws Exception{
//		Flux.interval(Duration.ofSeconds(1))
//		.log()
//		.take(2)
//		.subscribe();
//		Thread.sleep(5000);
//	}
	
//	@Test
//	void fluxFromInterval(){
//		Flux.interval(Duration.ofSeconds(1))
//		.log()
//		.take(2)
//		.subscribe();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	void fluxRequest(){
//		Flux.range(1, 5)
//		.log()
//		.subscribe(
//				null,
//				null,
//				null,
//				s -> s.request(3)
//				);
//	}
	
//	@Test
//	void fluxCustomSubscriber(){
//		Flux.range(1, 10)
//		.log()
//		.subscribe(
//				new BaseSubscriber<Integer>() {
//					int elementsToProcess = 3;
//					int counter = 0;
//					
//					public void hookOnSubscriber(Subscription subscription) {
//						System.out.println("Subscribeed!");
//						request(elementsToProcess);
//					}
//					
//					public void hookOnNext(Integer value) {
//						counter++;
//						if(counter == elementsToProcess) {
//							counter = 0;
//							
//							Random r = new Random();
//							elementsToProcess = r.ints(1,4).findFirst().getAsInt();
//							request(elementsToProcess);
//						}
//					}
//				});
//	}
	
	@Test
	void fluxLimitRate(){
		Flux.range(1, 5)
		.log()
		.limitRate(3)
		.subscribe();
	}
}
