package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	
	Calculator c = new Calculator();
	
	//@Disabled 
	@Test
	public void testAdd()
	{
		int r = c.add(100, 50);
		//Assertions.assertEquals(150,r);
		Assertions.assertEquals(150,r,"salemon bhoi");
	}
	
	@Test
	public void TestAssertFalse()
	{
		Assertions.assertEquals("Hello", "Hello");
		Assertions.assertFalse("Vaibhav".length()==3);
		Assertions.assertFalse(10>20,"10 is not greater");
	}
	
	@Test
	public void testAssertNull()
	{
		String str1=null;
		String str2="abc";
		
		Assertions.assertNull(str1);

		Assertions.assertNotNull(str2);		
	}
	@Test
	public void testArray()
	{
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());;
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());
		//Assertions.assertTrue(myList.isEmpty());
	}
}