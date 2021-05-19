package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Post;
import com.model.Product;
import com.repository.PostRepository;
// https://howtodoinjava.com/spring5/webmvc/spring-mvc-cors-configuration/
// @CrossOrigin at Class/Controller Level 
@CrossOrigin(origins = "*", allowedHeaders = "*")

//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
//@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	BiPredicate<String, String>isNullOrEmpty = (s1,s2) -> (s1 != null && s2 != null) && (s1.length() !=0 && s2.length() != 0);
	BiPredicate<String, String>isBothNotEqual = (s1,s2) -> (s1.equals(s2));
	
	Map<String, String> errors;
	
	@GetMapping(path = "/test")
	public String test() {
		return "Hello World2";
	}
	
	@GetMapping(path = "/posts")
	public List<Post> getPosts() {
			return postRepository.findAll();
	}
	
	@PostMapping(path = "/post")
	public Post createProduct(@RequestBody Post post) {
		return postRepository.save(post);
	}
	
	
	@PostMapping(path = "/posts")
	public ResponseEntity<Object> createStudent(@RequestBody @Valid Post post, BindingResult bindingResult) {
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
		return new ResponseEntity<Object>(postRepository.save(post),HttpStatus.OK);
	}
	
	@DeleteMapping("/post/{id}")
	public boolean deletePost(@PathVariable(value = "id") Long id) {
		postRepository.deleteById(id);
		return true;
	}
	
	@DeleteMapping("/posts")
	public boolean deleteAllPost() {
		postRepository.deleteAll();
		return true;
	}
	
	
}

