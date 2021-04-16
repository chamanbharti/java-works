package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import com.functional.ProductHandler;
import com.model.Product;
import com.repository.ProductRepository;

import io.netty.handler.codec.http.HttpMethod;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactiveSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringApplication.class, args);
	}

//	@Bean 
//	CommandLineRunner init(ProductRepository repository) {
//		return args -> {
//			Flux<Product> productFlux = Flux.just(
//					new Product(null, "Big Latte", 2.99),
//					new Product(null, "Big Decaf", 2.49),
//					new Product(null, "Green Tea", 1.99)
//					)
//				//.flatMap(p -> repository.save(p));
//					.flatMap(repository::save);
//			productFlux.thenMany(repository.findAll()).subscribe(System.out::println);
//			
//			
//		};
//	}
	
	@Bean 
	CommandLineRunner init(ReactiveMongoOperations operations,ProductRepository repository) {
		return args -> {
			Flux<Product> productFlux = Flux.just(
					new Product(null, "Big Latte", 2.99),
					new Product(null, "Big Decaf", 2.49),
					new Product(null, "Green Tea", 1.99)
					)
					.flatMap(repository::save);
					productFlux
					.thenMany(repository.findAll())
					.subscribe(System.out::println);
			/*operations.collectionExists(Product.class)
			.flatMap(exits -> exits ? operations.dropCollection(Product.class):Mono.just(exits))
			.thenMan(v -> operations.createCollection(Product.class))
			.subscribe(System.out::println);
			*/
			
		};
		
	}
	
	// funcation endpoints
//	@Bean
//	RouterFunction<ServerResponse> routes(ProductHandler handler) {
//		return route(GET("/products").and(accept(APPLICATION_JSON)), handler::getAllProducts)
//				.andRoute(POST("/products").and(accept(APPLICATION_JSON)), handler::saveProducts)
//				.andRoute(DELETE("/products").and(accept(APPLICATION_JSON)), handler::deleteAllProducts)
//				.andRoute(GET("/products/events").and(accept(TEXT_EVENT_STREAM)), handler::getProductEvents)
//				.andRoute(GET("/products/{id}").and(accept(APPLICATION_JSON)), handler::getProduct)
//			    .andRoute(PUT("/products/{id}").and(accept(APPLICATION_JSON)), handler::updateProduct)
//			    .andRoute(DELETE("/products/{id}").and(accept(APPLICATION_JSON)), handler::deleteProduct);
		
		
//		return nest(path("/products"),
//					nest(accept(APPLICATION_JSON).or(contentType(APPLICATION_JSON)).or(accept(TEXT_EVENT_STREAM)),
//					route(GET("/"), handler::getAllProducts)
//					.andRoute(method(HttpMethod.POST)), handler::saveProducts)
//					.andRoute(DELETE("/"), handler::deleteAllProducts)
//					.andRoute(GET("/events"), handler::getProductEvents)
//					.andNest(path("/{id}"),
//							route(method(HttpMethod.GET), handler::getProduct)
//							.andRoute(method(HttpMethod.PUT), handler::updateProduct)
//							.andRoute(method(HttpMethod.DELETE), handler::deleteProduct)
//							)
//					
//					
//					)
		
		
//	}
	
	/*
	 * Functional Programming Model
	 * Router function
	 * handler function
	 * 
	 * Springboot/springdata
	 * same configuration
	 * Reactive programming is  the foundation
	 */ 
}
