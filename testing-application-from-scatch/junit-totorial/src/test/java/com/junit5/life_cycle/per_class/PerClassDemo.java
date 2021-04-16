package com.junit5.life_cycle.per_class;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public class PerClassDemo {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("@BeforeAll got executed!!");
	}
	
	public PerClassDemo() {
		System.out.println("Constructor got executed!!");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach got executed!!");
	}
	
	@Test
	public int testOne() {
		System.out.println("testOne() got executed!!");
		return 1;
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
	public static void afterAll() {
		System.out.println("@AfterAll got executed!!");
	}
	
}
