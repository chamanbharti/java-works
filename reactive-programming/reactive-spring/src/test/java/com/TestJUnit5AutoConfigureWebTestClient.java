package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.FluxExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.controller.ProductController;
import com.model.Product;
import com.model.ProductEvent;
import com.repository.ProductRepository;

import reactor.test.StepVerifier;
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureWebTestClient
class TestJUnit5AutoConfigureWebTestClient {

	private WebTestClient client;
	
	private List<Product>expectedList;
	
	@Autowired
	private ProductRepository repository;
	
	@BeforeEach
	void beforeEach() {
		this.expectedList = repository.findAll().collectList().block();
		
		this.client = this.client
						  .mutate()
						  .baseUrl("/products")
						  .build();
		
		this.expectedList = repository.findAll().collectList().block();
		
	}
	
	@Test
	void testGetAllProducts() {
		client.get()
		.uri("/")
		.exchange()
		.expectStatus()
		.isOk()
		.expectBodyList(Product.class)
		.isEqualTo(expectedList);
	}
	
	@Test
	void testProductInvalidIdNotFound() {
		client.get()
		.uri("/aaa")
		.exchange()
		.expectStatus()
		.isNotFound();
	}
	
	@Test
	void testProductIdFound() {
		Product expectedProduct = expectedList.get(0);
		client.get()
		.uri("/{id}", expectedProduct.getId())
		.exchange()
		.expectStatus()
		.isOk()
		.expectBody(Product.class)
		.isEqualTo(expectedProduct);
	}
	
	@Test
	void testProductEvents() {
		ProductEvent expectedEvent = new ProductEvent(0L, "Product Event");
		
		FluxExchangeResult<ProductEvent> result =
		client.get()
		.uri("/events")
		.accept(MediaType.TEXT_EVENT_STREAM)
		.exchange()
		.expectStatus()
		.isOk()
		.returnResult(ProductEvent.class);
		
		StepVerifier.create(result.getResponseBody())
		.expectNext(expectedEvent)
		.expectNextCount(2)
		.consumeNextWith(event -> assertEquals(Long.valueOf(3), event.getEventId()))
		.thenCancel()
		.verify();
	}

}

