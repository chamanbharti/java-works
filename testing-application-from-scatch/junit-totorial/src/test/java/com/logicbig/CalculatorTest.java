package com.logicbig;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		int i = c.multiply(3, 5);
		Assert.assertEquals(i, 15);
	}
}
