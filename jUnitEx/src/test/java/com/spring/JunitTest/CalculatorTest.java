package com.spring.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test // jUnit maven dependencies에 활성화 안되면 buildpath에서 add library로 직접 넣는다. 
	public void test() {
		
		Calculator c = new Calculator();
		
		double res = c.sum(10, 20);
		
		assertEquals(30, res, 0);// (기대값, 실제값, 오차범위(허용오차)) cf) 허용오차는 시간도 가능
		
		// Run as : JUnitTest로 실행
	}
}
