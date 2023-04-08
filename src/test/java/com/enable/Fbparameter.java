package com.enable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbparameter {
	@Parameters({"textuser","textpass"})
	@Test
	private void launch(String textuser,String textpass) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(textuser);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(textpass);
		
		
		



	}

}
