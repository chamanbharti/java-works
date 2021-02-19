package com.junit.test.hello_world;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.junit.hello_world.Calculation;

public class TestCalculation {

	@Test
	public void testFindMax() {
//		assertEquals(4, Calculation.findMax(new int[] {1,2,4,2}));
//		assertEquals(-1, Calculation.findMax(new int[] {-12,-1,-3,-4,-2}));
		
		assertEquals(4, Calculation.findMax2(new int[] {1,2,4,2}));
		assertEquals(-1, Calculation.findMax2(new int[] {-12,-1,-3,-4,-2}));
	}
}
