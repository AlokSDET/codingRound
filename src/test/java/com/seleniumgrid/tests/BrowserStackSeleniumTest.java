package com.seleniumgrid.tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackSeleniumTest {

	public static final String USERNAME = "alokshrivastava1";
	public static final String AUTOMATE_KEY = "r3X63CxvQcci42CiXVS6";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "76.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("name", "Bstack-[Java] Sample Test");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://demoqa.com/html-contact-form/");
		driver.findElement(By.className("firstname")).sendKeys("Alok");
		;
		driver.findElement(By.id("lname")).sendKeys("Shrivastava");
		;
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();

		System.out.println(driver.getTitle());
		driver.quit();

	}
}