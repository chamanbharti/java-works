package com.microservices.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockUIService {

//	public String getTotalStockPrice(String companyName, Integer quantity) {
//		String REST_ENDPOINT = "http://localhost:2222/calculate/{companyName}/quantity}";
//		WebClient webClient = WebClient.create();
//		String response = webClient.get()
//		.uri(REST_ENDPOINT, companyName, quantity)
//		.retrieve()
//		.bodyToMono(String.class)
//		.block();
//		return response;
//	}
	
	public String getTotalStockPrice(String companyName, Integer quantity) {
		String REST_ENDPOINT = "http://localhost:2222/calculate/{companyName}/quantity}";
		String response = null;
		WebClient webClient = WebClient.create();
		try {
			  response = webClient.get()
					.uri(REST_ENDPOINT, companyName, quantity)
					.retrieve()
					.bodyToMono(String.class)
					.block();
		} catch (Exception e) {
			e.printStackTrace();
			response = "Company Not Found";
		}
		return response;
	}

}
