package com.learnreactivespring.fluxAndmono;
import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


public class FluxTest {

	@Test
	void firstFlux() {
		Flux.just("A","B","C")
		.log()
		.subscribe();
	}
	@Test 
	void firstFluxIterable() {
		String[] str = {"A","B","C"};
		Flux.just(Arrays.asList(str))
		.log()
		.subscribe();
	}
	@Test 
	void firstFluxRange() {
		Flux.range(10, 5)
		.log()
		.subscribe();
	}
//	@Test 
//	void firstFluxInterval() throws Exception {
//		Flux.interval(Duration.ofSeconds(1))
//		.log()
//		.subscribe();
//		Thread.sleep(5000);
//	}
	@Test 
	void firstFluxInterval() throws Exception {
		Flux.interval(Duration.ofSeconds(1))
		.log()
		.take(2)
		.subscribe();
		Thread.sleep(5000);
	}
	@Test 
	void fluxRequest(){
		Flux.range(1, 5)
		.log()
		.subscribe(null,null,null,s->s.request(3));
	}
	@Test 
	void fluxLimitRate(){
		Flux.range(1, 5)
		.log()
		.limitRate(3)
		.subscribe();
	}
	
	
}
