package test.cc.openhome;

import calc.cc.openhome.Calculator;
import junit.framework.TestCase;

public class CalculatorTestAuto extends TestCase {

	private Calculator calculator;
	protected void setUp() throws Exception {
		super.setUp();
		calculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPlus() {
		//If do nothing, this test case will pass.
	}

	public void testMinus() {
		int expected = 1;
		int result = calculator.minus(3, 2);
		assertEquals(expected, result);
	}

	public void testMultiply() {
		fail("Not yet implemented");
	}
	
	// http://openhome.cc/Gossip/JUnit/TestCase.html
	public void testStringToInt() {
		try {
			calculator.stringToInt("123");
			calculator.stringToInt("hello");
			fail("No throw expected Exception");
		} catch (NumberFormatException e) {
			System.out.println("There kind of exception is not considered.");
		}
	}
	
	public void testError() {
		int expected = 0;
		//This test case will be Error instead of Failure
		//Case1
		int result = calculator.stringToInt2("hello");
		
		//Case2
		String numStr = "world";
		int num = Integer.parseInt(numStr);
		System.out.println(num);
		assertEquals(expected, result);
	}

}
