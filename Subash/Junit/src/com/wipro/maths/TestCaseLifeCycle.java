package com.wipro.maths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseLifeCycle {

	@Test
	public void test() {
		System.out.println("IN test 1");
		//fail("Not yet implemented");
	}

	@Test
	public void test2() {
		System.out.println("IN test 2 ");
		//fail("Not yet implemented");
	}

	public TestCaseLifeCycle() {
	    System.out.println(" Constructor ");
		//super();
		// TODO Auto-generated constructor stub
	}
    
	@Before
	public void beforeTest(){
		System.out.println(" Before test ");
	}
	@After
	public void afterTest()
	{
		System.out.println(" After test ");
	}
	
	@BeforeClass
	public static void beforeTestAll(){
		System.out.println(" Before Class Creation ");
	}
	@AfterClass
	public static void afterTestAll()
	{
		System.out.println(" After Class Completed ");
	}
	
	
}
