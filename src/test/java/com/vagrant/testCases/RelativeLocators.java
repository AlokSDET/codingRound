package com.vagrant.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;

public class RelativeLocators extends BaseClass{

	
	@BeforeMethod
	public void launchOrangePage() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void relativeLocatorTesting1() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Alok");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("123");
		
		driver.findElement(withTagName("input").below(By.name("txtPassword"))).click();
	}
	
	@Test
	public void relativeLocatorTesting2() {
		
		List<WebElement> socialAccounts = driver.findElements(withTagName("img").below(By.xpath("//a[text()='OrangeHRM, Inc']")));
		System.out.println(socialAccounts.size());
		
		for (WebElement socialAccount : socialAccounts) {
			System.out.println(socialAccount.getAttribute("alt"));
		}
	}

}
