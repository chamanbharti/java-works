package com.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.service.HelloService;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class HelloServiceTest {

	@Autowired(required=true)
	HelloService helloService;
	
	@DisplayName("Test Spring @Autowired Integration")
	@Test
	void testGet() {
		assertEquals("Hello Junit 5", helloService.get());
	}
	
}
