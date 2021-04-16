package com.logicbig;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class RealTest {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMultiply() {
		int i = calculator.multiply(3, 5);
		Assert.assertEquals(i, 15);
	}
	
	@Test
	public void testDivide() {
		int i = calculator.divide(255, 5);
		Assert.assertEquals(i, 51);
	}
	
	@Test
	public void testAdd() {
		int i = calculator.multiply(6, 5);
		Assert.assertEquals(i, 30);
	}
}
