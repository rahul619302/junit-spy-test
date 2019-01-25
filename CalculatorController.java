package com.lti.junit.test.practice;

public class CalculatorController {
	
	private ICalculatorService calculatorService=new CalculatorService();
	
	public int  add(int a, int b) {
		return calculatorService.add(a,b);
	}

}
