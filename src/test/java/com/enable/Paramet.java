package com.enable;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramet {
	
	@Parameters({"a","b"})
	@Test
	public void test1(int a,int b) {
	
	int sum =a+b;
		System.out.println("sum is:"+sum);
		

	}

}
