package test.cc.openhome;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import calc.cc.openhome.Calculator;


public class CalculatorTest extends TestCase {
	private Calculator calculator;
	
	@Override
	protected void setUp() {
		calculator = new Calculator();
	}
	
	@Override
	protected void tearDown() {
		calculator = null;
	}

	public void testPlus() {
		int expected = 5;
		//int expected = 4;
		int result = calculator.plus(3, 2);
		assertEquals(expected, result);
	}
	
	public void testMinus() {
		int expected = 1;
		int result = calculator.minus(3, 2);
		assertEquals(expected, result);
	}
	
	//this method will not be tested, because it is not testXXX method
	public void abcMinus() {
		int expected = 1;
		int result = calculator.minus(3, 2);
		assertEquals(expected, result);
	}
	
	//run by java Application will run TestRunner in console
	public static void main(String[] args) {
		TestRunner.run(CalculatorTest.class);
	}/**/

}
