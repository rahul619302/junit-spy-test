package com.lti.test;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.lti.junit.test.practice.CalculatorController;
import com.lti.junit.test.practice.ICalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

	@Mock
	private ICalculatorService calculatorService;
	@InjectMocks//It is use for mocking
	//@Spy//It call dependent methods with real object
	private CalculatorController calculatorController;
	
	@Before
	public void setUp() {
		//BDDMockito.given(calculatorService.add(Mockito.anyInt(), Mockito.anyInt())).willReturn(10);
	}
	
	@Test
	public void addTest() {
		assertThat(10, Is.is(calculatorController.add(6, 4)));
	}

}
