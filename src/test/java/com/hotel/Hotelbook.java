package com.hotel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dev.failsafe.Failsafe;
import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;

public class Hotelbook {
	
	@Test(priority=10, invocationCount=1 ,enabled=true)
	private void Register() {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("yugeshram");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("yugeshram1234");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement sel = driver.findElement(By.id("location"));
		Select se = new Select(sel);
		se.selectByValue("Sydney");
		
		WebElement sel2 = driver.findElement(By.id("hotels"));
		        
				Select select = new Select(sel2);
				
				select.selectByIndex(1);
				
		WebElement sele3 = driver.findElement(By.id("room_type"));
		Select sc = new Select(sele3);
		sc.selectByVisibleText("Double");
		
		
		WebElement sel4 = driver.findElement(By.id("room_nos"));
		Select scel4 = new Select(sel4);
		scel4.selectByIndex(2);
		
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("25/03/2023");
		
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		outdate.clear();
		outdate.sendKeys("27/03/2023");
		
		WebElement adul = driver.findElement(By.id("adult_room"));
		Select sel5 = new Select(adul);
		
		sel5.selectByValue("3");
		
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select selec6 = new Select(child);
		selec6.selectByVisibleText("3 - Three");
		
		
		WebElement cli = driver.findElement(By.id("Submit"));
		cli.click();
		
		
		WebElement chk = driver.findElement(By.id("radiobutton_0"));
		chk.click();
		
		WebElement conti= driver.findElement(By.id("continue"));
		conti.click();
		
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("yugesh");
		
		
		
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("ram");
		
		WebElement adrs = driver.findElement(By.id("address"));
		adrs.sendKeys("1/51,chennai");
		
		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("1234567891012343");
		
		WebElement typ = driver.findElement(By.id("cc_type"));
		Select sce7 = new Select(typ);
		
		sce7.selectByValue("VISA");
		
		WebElement mon = driver.findElement(By.id("cc_exp_month"));
		
		Select sel8 = new Select(mon);
		
		sel8.selectByVisibleText("March");
		
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		
		Select sel9 = new Select(year);
		
		sel9.selectByValue("2022");
		
		WebElement numer = driver.findElement(By.id("cc_cvv"));
		numer.sendKeys("8056");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		
		

//	long timeMillis = System.currentTimeMillis();
//	System.out.println(timeMillis);
//	
//	WebElement new1 = driver.findElement(By.xpath("//a[text()='Search Hotel']"));
//	new1.click();
//	
//	     
//   WebElement out = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
//   out.click();
//   
//  
//   
//
//  WebElement del = driver.findElement(By.id("check_all"));
//  del.click();
//  
//  WebElement hand = driver.findElement(By.name("cancelall"));
//  hand.click();
//  Alert al = driver.switchTo().alert();
//  String text = al.getText();
//  System.out.println(text);
//  
//  al.accept();
//
	
		
		
		
	     
	
	
	
	
	
	
	
	}

		@Test( priority=9 ,invocationCount=2 )
		private void cl() {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(opt);
			
			driver.get("https://adactinhotelapp.com/");
			
			WebElement user = driver.findElement(By.id("username"));
			user.sendKeys("yugeshram");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("yugeshram1234");
			
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			
			
		}
	}


