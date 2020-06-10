package com.bootcamp.calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTest {

	@Test
	void testSum() {
		assertEquals(6, MathUtils.sum(5, 1));
	}
	
	@Test
	void testMult() {
		assertEquals(10, MathUtils.multiply(5, 2));
	}

}
