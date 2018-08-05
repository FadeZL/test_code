package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.CalculatorTest;

public class CalculatorTestTest {
	
	CalculatorTest mycal=new CalculatorTest();

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int x = new CalculatorTest().add(3,5);
		assertEquals(x,8);
		System.out.println("Test1 done");
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int x = new CalculatorTest().subtract(8, 2);
		assertEquals(x,6);
		System.out.println("Test2 done");
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int x = new CalculatorTest().multiply(15, 2);
		assertEquals(x,30);
		System.out.println("Test3 done");
	}

	@Test
	public void testDivide(){
		//fail("Not yet implemented");
		
		long x;
		try {
			x = (long) mycal.divide(8, 2);
			assertEquals(4,x);
			System.out.println("Test4 done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
