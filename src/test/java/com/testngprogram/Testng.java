package com.testngprogram;

import org.testng.annotations.Test;

public class Testng{
	
		
		@Test(priority = 12,invocationCount = 2)
		private void test02() {
		System.out.println("test02");

		}
		@Test(priority = 22)
		private void test01() {
			System.out.println("test01");
			
			
		}
		@Test(priority = -1)
		private void test03() {
			System.out.println("test03");
		
	}    @Test(priority=0)
		private void test04() {
		System.out.println("test04");
			
		}
	}


