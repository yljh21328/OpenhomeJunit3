package test.cc.openhome;

import calc.cc.openhome.Calculator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class CalculatorTestSuite extends TestCase {

	private Calculator calculator;
	
	public CalculatorTestSuite() {
		
	}
	
	public CalculatorTestSuite(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		calculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
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

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new CalculatorTestSuite("testPlus"));
		//suite.addTest(CalculatorTestSuite.suite());
		suite.addTestSuite(CalculatorTest.class);
		return suite;
		
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
		
		//TestResult result = new TestResult();
		//suite().run(result);
	}
}
