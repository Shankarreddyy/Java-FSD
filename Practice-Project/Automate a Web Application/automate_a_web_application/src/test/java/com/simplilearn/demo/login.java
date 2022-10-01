package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	
	WebDriver driver;
	@Test
	public void f() {
		
		driver.get("https://www.shine.com/myshine/login/");
		driver.findElement(By.id("id_email_login")).sendKeys("ynarendhar1234@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Sp@123456");
		driver.findElement(By.name("login")).submit();
		
		
		}
		@BeforeMethod
		public void beforeMethod() {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		@AfterMethod
		public void afterMethod() {
			//driver.close();
			driver=null;
		}
		
		
	}