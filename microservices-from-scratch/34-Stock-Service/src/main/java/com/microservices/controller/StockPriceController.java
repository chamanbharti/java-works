package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.exception.CompanyNotFoundException;
import com.microservices.service.StockPriceService;
@RestController
@RequestMapping("/price")
public class StockPriceController {

	@Autowired
	private StockPriceService stockPriceService;
	@GetMapping("/stockprice/{companyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable("companyName") String companyName){
//		Double stockPrice = stockPriceService.getStockPrice(companyName);
//		return new ResponseEntity<>(stockPrice, HttpStatus.OK);
		
		Double stockPrice = stockPriceService.getStockPrice(companyName);

		return new ResponseEntity<>(stockPrice, HttpStatus.OK);
	}

}
