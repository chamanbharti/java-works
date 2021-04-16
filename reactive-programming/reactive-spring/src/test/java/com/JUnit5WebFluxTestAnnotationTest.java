package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.FluxExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.controller.ProductController;
import com.model.Product;
import com.model.ProductEvent;
import com.repository.ProductRepository;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
@ExtendWith(SpringExtension.class)
@WebFluxTest(ProductController.class)
class JUnit5WebFluxTestAnnotationTest {

	private WebTestClient client;
	
	private List<Product>expectedList;
	
	@MockBean
	private ProductRepository repository;
	
	@MockBean
	private CommandLineRunner commandLineRunner;
	
	@BeforeEach
	void beforeEach() {
		this.client = WebTestClient.bindToController(new ProductController(repository))
				.configureClient()
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
		String id = "aaa";
		when(repository.findById(id)).thenReturn(Mono.empty());
		
		client.get()
		.uri("/{id}")
		.exchange()
		.expectStatus()
		.isNotFound();
	}
	
	@Test
	void testProductIdFound() {
		Product expectedProduct = expectedList.get(0);
		when(repository.findById(expectedProduct.getId())).thenReturn(Mono.empty());
		
		client.get()
		.uri("/products/{id}", expectedProduct.getId())
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
		.uri("/products/events")
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

