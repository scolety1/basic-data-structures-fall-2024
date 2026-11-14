package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		int result = Calculator.add(2, 3);
		assertEquals(5, result);
		
		
	}
	
	@Test
	public void testAddNegative() {
		int result = Calculator.add(-4, -7);
		assertEquals(-11, result);
	}

}
