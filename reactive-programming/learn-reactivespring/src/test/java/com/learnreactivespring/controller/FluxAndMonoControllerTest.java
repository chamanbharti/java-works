//package com.learnreactivespring.controller;
//
//
//import reactor.core.publisher.Flux;
//import reactor.test.StepVerifier;
//
//@RunWith(SpringRunner.class)
//@WebFluxTest
//public class FluxAndMonoControllerTest {
//	@Autowired
//	WebTestClient webTestClient;
//	@Test
//	public void flux_approach_1() {
//		Flux<Integer> integerFlux = webTestClient.get().uri("/flux")
//				.accept(MediaType.APPLICATION_JSON_UTF8)
//				.exchange()
//				.expectStatus().isOk()
//				.returnResult(Integer.class)
//				.getResponseBody();
//		StepVerifier.create(integerFlux)
//		.expectSubscription()
//		.expectNext(1)
//		.expectNext(2)
//		.expectNext(3)
//		.expectNext(4)
//		.verifyComplete();
//	}
//}
