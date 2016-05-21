package test.cc.openhome;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestListener;
import junit.framework.TestResult;
import junit.textui.TestRunner;

import java.util.Enumeration;

import calc.cc.openhome.Calculator;


public class CalculatorTest3 extends TestCase {
	private Calculator calculator;
	
	public CalculatorTest3() {
		
	}
	
	public CalculatorTest3(String name) {
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
	
	public void abcMinus2() {
		fail();
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
	
	//run by java Application will run TestRunner in console
	public static void main(String[] args) {
		CalculatorTest3[] calculatorTests = {
				new CalculatorTest3("testPlus"),
				new CalculatorTest3("testMinus"),
				new CalculatorTest3("abcMinus"),
				new CalculatorTest3("abcMinus2"),
				new CalculatorTest3("testError")
		};


		TestResult result = new TestResult();
		result.addListener(new TestListener() {
			public void addError(Test test, Throwable t) {
				System.out.println("Error");
			}

			public void addFailure(Test test, AssertionFailedError t) {
				System.out.println("Failure");
			}

			public void endTest(Test test) {
				System.out.println("End");
			}

			public void startTest(Test test) {
				System.out.println("Start");
			}
		});
		
		for (CalculatorTest3 test : calculatorTests) {
			//TestResult result = test.run();
			test.run(result);
			System.out.println(test.getName());
			System.out.println("\tError: " + result.errorCount());
			System.out.println("\tFailure: " + result.failureCount());
		}
		
		for (Enumeration<TestFailure> e = result.failures(); e.hasMoreElements();) {
			TestFailure failure = e.nextElement();
			System.out.print(failure.isFailure() ? "Failure: " : "Error: ");
			System.out.println(failure.exceptionMessage());
			System.out.println(failure.trace());
		}
		
		for (Enumeration<TestFailure> e = result.errors(); e.hasMoreElements();) {
			TestFailure failure = e.nextElement();
			System.out.print(failure.isFailure() ? "Failure: " : "Error: ");
			System.out.println(failure.exceptionMessage());
			System.out.println(failure.trace());
		}
		//TestRunner.run(CalculatorTest2.class);
	}/**/

}
