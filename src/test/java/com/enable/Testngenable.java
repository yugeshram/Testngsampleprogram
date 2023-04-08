package com.enable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngenable {

	
	@BeforeMethod
	private void day01() {
		System.out.println("@BeforeMethod  1");
		
	}
	@AfterMethod
	private void day02() {
	System.out.println("@AfterMethod   2");
}
	@BeforeTest
	private void day03() {
		System.out.println("@BeforeTest   3");
		
	}
	@AfterTest
	private void day04() {
		System.out.println("@AfterTest    4");
		
	}
	@BeforeClass
	private void day05() {
		System.out.println("@BeforeClass   5");
		
	}
	@AfterClass
	private void day06() {
		System.out.println("@AfterClass     6");
		
	}
	@Test(enabled=true)
	private void day07() {
		System.out.println("@Test     7");
		
		
		
	}
	@BeforeSuite(enabled=false)
	private void day08() {
		System.out.println("@BeforeSuite     8");
		
		
		
	}
	@AfterSuite(enabled=false)
	private void day09() {
		System.out.println("@AfterSuite    9");
		
		
		
	}
}