package com.LocatorsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q4 {
	WebDriver driver;
	int total = 0;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.navigate().to("https://store.webkul.com");
		driver.manage().window().maximize();

	}

	@Test
	public void LinksCount() {
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkcount = links.size();
		total = total + links.size();

		System.out.println("Number of links: " + linkcount);
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
			String title = driver.getTitle();
			System.out.println(title);
		}

	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
