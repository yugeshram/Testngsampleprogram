package com.enable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	public static WebDriver driver;
	
	@BeforeSuite
	public void launch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		
		

	}
	@AfterSuite
	private void close() {
		//driver.close();

	}
	@Test
	public void logic() {

    WebElement user = driver.findElement(By.id("email"));
    user.sendKeys("67676");

	}

}
