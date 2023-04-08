package com.enable;

import org.testng.annotations.Test;

public class Group {

	@Test(groups= {"sanity","smoke"})
	private void test01() {
		System.out.println("@Test1");

	}
	@Test(groups="smoke")
	private void test02() {
		System.out.println("@Test2");
		

	}
	@Test
	private void test03() {
		
		System.out.println("@Test3");
	}
	@Test(groups= {"smoke","sanity"})
	private void test04() {
		
		System.out.println("@Test4");
	}
	@Test(groups="sanity")
	private void test05() {
		System.out.println("@Test5");	

	}
}
