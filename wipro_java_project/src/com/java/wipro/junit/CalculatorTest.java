package com.java.wipro.junit;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *@author Nikunj 
 */
public class CalculatorTest 
{	
	private final Calculator calculator =new Calculator();
	
	@Test
	public void testAdd()
	{
		int result =calculator.add(3,2);
		assertEquals(5,result);
	}
	
	@Test
	public void testSubstract()
	{
		int result =calculator.substract(5,3);
		assertEquals(2,result);
	}
	
	@Test
	public void testAddWithNegativeNumbers()
	{
		int result =calculator.add(-3,-2);
		assertEquals(-5,result);
	}
	
	@Test
	public void testSubstractWithNegativeNumbers()
	{
		int result =calculator.substract(-3,-2);
		assertEquals(-1,result);
	}
	
}
