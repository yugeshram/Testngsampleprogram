package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testeng {
	
	@BeforeSuite
private void test01() {
		System.out.println("@BeforeSuite");
		
}
	@AfterSuite
private void test02() {
		System.out.println("@AfterSuite");
	

}
	@BeforeTest
private void test03() {
		System.out.println("@BeforeTest");
	

}
	@AfterTest
private void test04() {
		System.out.println("@AfterTest");
}
	@BeforeMethod
private void test05() {
		System.out.println("@BeforeMethod");

}
	@AfterMethod
private void test06() {
		System.out.println("@AfterMethod");

}
	@BeforeClass
private void test07() {
		System.out.println("@BeforeClass");

}
	@AfterClass
private void test08() {
		System.out.println("@AfterClass");

}
	@Test
private void test09() {
		System.out.println("@Test");

}
     @Test
	private void test10() {
    System.out.println("test1");	

}
     @Test
private void test11() {
	System.out.println("test2");

}
}
