package com.junit5.life_cycle.per_method;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_METHOD)
public class PerMethodDemo {

	@BeforeAll
	public void beforeAll() {
		System.out.println("@BeforeAll got executed!!");
	}
	
	public PerMethodDemo() {
		System.out.println("Constructor got executed!!");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach got executed!!");
	}
	
	@Test
	public void testOne() {
		System.out.println("testOne() got executed!!");
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo() got executed!!");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach got executed!!");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("@AfterAll got executed!!");
	}
	
}
