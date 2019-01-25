package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lti.junit.test.practice.Calculator2;

public class CalculatorTest2 {

	private Calculator2 calculator;

	@BeforeClass
	public static void setUpClassBefore() {
		System.out.println("setUpClassBefore2");
	}

	@AfterClass
	public static void setUpClassAfter() {
		System.out.println("setUpClassAfter2");
	}

	@Before
	public void setUpBefore() {
		calculator = new Calculator2();
		System.out.println("setUpBefore2");
	}

	@After
	public void setUpAfter() {
		System.out.println("setUpAfter2");
	}

	@Test(timeout=1000)
	public void testAdd() {
		System.out.println("testAdd2");
		assertEquals("************Error On Test Add Fail************", 10, calculator.add(6, 4));
	}

	@Test
	public void testSub() {
		assertEquals("************Error On Test Sub Fail************", 5, calculator.sub(4, 9));
		assertEquals("************Error On Test Sub Fail************", 5, calculator.sub(9, 4));
	}

}
