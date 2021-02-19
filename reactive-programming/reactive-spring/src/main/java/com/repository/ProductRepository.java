package com.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.model.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
