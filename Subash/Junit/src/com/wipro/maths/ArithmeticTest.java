package com.wipro.maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testabc() {
		Arithmetic obj = new Arithmetic();
		obj.a=19;
		obj.b=9;
		int exp=28;
		assertEquals("Addition failed",exp,obj.add());
		
	}
	
	
}
