package com.lti.junit.test.practice;

public class Calculator {

	public int add(int a, int b) {
		return (a + b);
	}

	public int sub(int a, int b) {
		return (a > b ? (a - b) : (b - a));
	}

}
