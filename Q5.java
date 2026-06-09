package com.LocatorsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q5 {

	WebDriver driver;

	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testPractice() {

		
		driver.navigate().to("http://automationpractice.com/index.php");

		
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		System.out.println("Title Length: " + title.length());

		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "http://automationpractice.com/index.php";

		System.out.println("Current URL: " + currentURL);

		if (currentURL.equals(expectedURL)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		
		String pageSource = driver.getPageSource();
		System.out.println("Page Source Length: " + pageSource.length());

	
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Links: " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
	}

	  @AfterMethod
	 public void tearDown() {
		driver.close();
	}
}
