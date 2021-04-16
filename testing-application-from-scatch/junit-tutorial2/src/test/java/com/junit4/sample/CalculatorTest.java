package com.junit4.sample;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.junit.hello_world.Calculator;
public class CalculatorTest {

	@Test
	public void evaluateExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6,sum);
	}
}
