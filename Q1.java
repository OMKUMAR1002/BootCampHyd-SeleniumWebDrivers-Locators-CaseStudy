package com.LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q1 {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.login.hiox.com/register?referrer=easycalculation.com");
		driver.manage().window().maximize();

	}

	@Test
	public void locatorsID() {
		driver.findElement(By.id("xreg_usr")).sendKeys("Naman");
		driver.findElement(By.id("xreg_email")).sendKeys("Naman@gmail.com");
		driver.findElement(By.id("xreg_pass")).sendKeys("password123");
		driver.findElement(By.id("xreg_confirm")).sendKeys("password123");
		driver.findElement(By.id("xreg_cnt")).sendKeys("India");;
		driver.findElement(By.id("xreg_mob")).sendKeys("123456789");

		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		String pg = driver.getPageSource();
		System.out.println(pg);
		String pageSource = driver.getPageSource();
		System.out.println("Page Source Length: " + pageSource.length());

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
