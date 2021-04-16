package com.logicbig;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCycleTest {

	public LifeCycleTest() {
	      System.out.printf("Constructor invoked. Instance: %s%n", this);
	  }
	
	@BeforeClass
	  public static void beforeClassMethod() {
	      System.out.println("@BeforeClass static method invoked.");
	  }
	
	 @Test
	  public void test1() {
	      System.out.printf("@Test method 1  invoked. Instance: %s%n", this);
	  }

	  @Test
	  public void test2() {
	      System.out.printf("@Test method 2  invoked. Instance: %s%n", this);
	  }
	  
	  @Before
	  public void beforeMethod() {
	      System.out.printf("@Before method invoked. Instance: %s%n", this);
	  }

	  @After
	  public void afterMethod() {
	      System.out.printf("@After method invoked. Instance: %s%n", this);
	  }

	  @AfterClass
	  public static void afterClassMethod() {
	      System.out.printf("@AfterClass static method invoked.%n");
	  }
}
