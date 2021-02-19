package com.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.exception.CompanyNotFoundException;
import com.microservices.model.StockPrice;
import com.microservices.repository.StockPriceRepository;
@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepository;
	@Override
	public Double getStockPrice(String companyName) {
		StockPrice stockPrice = stockPriceRepository.findByCompanyName(companyName);
		if(stockPrice == null) {
		throw new CompanyNotFoundException("Company is not available in database");
	    }
		return stockPrice.getCompanyPrice();
	}

}
