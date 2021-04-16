package com.functional.webclient;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.model.Product;

public class WebClientVsRestTemplate {

	//Synchronous
	RestTemplate tempalte = new RestTemplate();
	Product product = tempalte.getForObject("http://localhost:8080/products/1", Product.class);
	
	//Asynchronous
	//WebClient webClient = WebClient.create();
	
	//WebClient webClient = WebClient.create("http://localhost:8080/products/1");
	
//	WebClient webClient = WebClient.builder()
//			.baseUrl("http://localhost:8080/products/1")
//			.defaultHeader(HttpHeaders.USER_AGENT, "Spring 5")
//			.build();
	
//	WebClient webClient = webClient.mutate()
//			.baseUrl("http://localhost:8080/products/1")
//			.build();
}
