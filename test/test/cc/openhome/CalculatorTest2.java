package test.cc.openhome;

import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.textui.TestRunner;
import calc.cc.openhome.Calculator;


public class CalculatorTest2 extends TestCase {
	private Calculator calculator;
	
	public CalculatorTest2() {
		
	}
	
	public CalculatorTest2(String name) {
		super(name);
	}
	
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
	
	public void abcMinus() {
		int expected = 1;
		int result = calculator.minus(3, 2);
		assertEquals(expected, result);
	}
	
	//run by java Application will run TestRunner in console
	public static void main(String[] args) {
		CalculatorTest2[] calculatorTests = {
				new CalculatorTest2("testPlus"),
				new CalculatorTest2("testMinus"),
				new CalculatorTest2("abcMinus")
		};
		
		for (CalculatorTest2 test : calculatorTests) {
			TestResult result = test.run();
			System.out.println(test.getName());
			System.out.println("\tError: " + result.errorCount());
			System.out.println("\tFailure: " + result.failureCount());
		}
		//TestRunner.run(CalculatorTest2.class);
	}/**/

}
