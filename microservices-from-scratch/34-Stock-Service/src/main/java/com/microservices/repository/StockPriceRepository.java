package com.microservices.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.model.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable>{
	public StockPrice findByCompanyName(String companyName);
}
