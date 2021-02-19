package com.learnreactivespring.fluxAndmono;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Mono;

public class MonoTest0 {
	@Test
	void firstMono() {
		Mono.just("A")
		.log();
	}
}
