package com.LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q2 {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.navigate().to(" https://www.easycalculation.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void locatorsIDandPath() {
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
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
