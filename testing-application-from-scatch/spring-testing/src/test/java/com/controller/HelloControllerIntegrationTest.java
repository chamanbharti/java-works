package com.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerIntegrationTest {

	@LocalServerPort
	private int port;
	
	private URL base;
	
	@Autowired
	private TestRestTemplate template;
	
	public HelloControllerIntegrationTest() {
		System.out.println("inside constructor");
	}
	
	@BeforeAll
	public static void m() {
		System.out.println("inside BeforeAll");
	}
	
	@BeforeEach
	public void setUp() throws Exception{
		System.out.println("inside @BeforeEach");
		this.base = new URL("http://localhost:" + port + "/");
	}
	
	@Test
	public void getHello() throws Exception {
		System.out.println("inside @Test");
		ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
		assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
	}
	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.template.getForObject("http://localhost:" + port + "/",String.class))
		.contains("Hello, World");
	}
	@AfterEach
	public void m2() {
		System.out.println("inside @AfterEach");
	}
	
	@AfterAll
	public static void m3() {
		System.out.println("inside @AfterAll");
	}
}
