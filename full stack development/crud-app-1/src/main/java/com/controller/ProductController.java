package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ResourceNotFoundException;
import com.model.Product;
import com.model.Student;
import com.repository.ProductRepository;
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	BiPredicate<String, String>isNullOrEmpty = (s1,s2) -> (s1 != null && s2 != null) && (s1.length() !=0 && s2.length() != 0);
	BiPredicate<String, String>isBothNotEqual = (s1,s2) -> (s1.equals(s2));
	
	
//	@PostMapping(path = "/product")
//	public Product createProduct(@RequestBody Product product) {
//		return productRepository.save(product);
//	}
	Map<String, String> errors;
	@PostMapping(path = "/product")
	public ResponseEntity<Object> createStudent(@RequestBody @Valid Product product, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			errors = new HashMap<>();
			for (FieldError error:bindingResult.getFieldErrors()) {
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Object>(errors, HttpStatus.NOT_ACCEPTABLE);
		}
//		Optional<Product> pt = productRepository.findById(product.getId());
//		if(pt.isPresent()) {
//			return new ResponseEntity<Object>("Duplicate id",HttpStatus.CONFLICT);
//		}
		return new ResponseEntity<Object>(productRepository.save(product),HttpStatus.OK);
	}
	
	@GetMapping(path = "/products")
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping(path = "/productTitle")
	public String productTitle() {
		return "Bhart Products Shop!";
	}
	
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Product user = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + id));
		return user;
	}
	
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@DeleteMapping("/product/{id}")
	public boolean deleteProduct(@PathVariable(value = "id") Long id) {
		productRepository.deleteById(id);
		return true;
	}
	
	@DeleteMapping("/product")
	public boolean deleteAllProduct() {
		productRepository.deleteAll();
		return true;
	}
	
}

