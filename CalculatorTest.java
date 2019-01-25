package com.lti.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.lti.junit.test.practice.Calculator;

public class CalculatorTest {

	private Calculator calculator;
	
	@Rule
	public Timeout timeout=new Timeout(10000);

	@BeforeClass
	public static void setUpClassBefore() {
		System.out.println("setUpClassBefore");
	}

	@AfterClass
	public static void setUpClassAfter() {
		System.out.println("setUpClassAfter");
	}

	@Before
	public void setUpBefore() {
		calculator = new Calculator();
		System.out.println("setUpBefore");
	}

	@After
	public void setUpAfter() {
		System.out.println("setUpAfter");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd");
		assertEquals("************Error On Test Add Fail************", 10, calculator.add(6, 4));
	}

	@Test
	public void testSub() {
		assertEquals("************Error On Test Sub Fail************", 5, calculator.sub(4, 9));
		assertEquals("************Error On Test Sub Fail************", 5, calculator.sub(9, 4));
	}

}
