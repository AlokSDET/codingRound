package com.seleniumgrid.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BrowserStackSeleniumTest {

	public static WebDriver driver;
	public static DesiredCapabilities caps;
	public static final String USERNAME = "alokshrivastava2";
	public static final String AUTOMATE_KEY = "7quzdszyHU2Lhys3Vm5G";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test(dataProvider = "parallelBrowserStack", description = "running this test parallely on three enviornment")
	public void parallelTest(Platform platform, String browserName, String browserVersion)
			throws MalformedURLException {
		caps = new DesiredCapabilities();
		caps.setCapability("browser", browserName);
		caps.setCapability("browser_version", browserVersion);
		caps.setPlatform(platform);
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("name", "Bstack-[Java] Sample Test");

		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://demoqa.com/html-contact-form/");
		driver.findElement(By.className("firstname")).sendKeys("Alok");

		driver.findElement(By.id("lname")).sendKeys("Shrivastava");

		driver.findElement(By.xpath("//input[@value='Submit']")).submit();

		System.out.println(driver.getTitle());

	}

	@DataProvider(name = "parallelBrowserStack", parallel = true)
	public Object[][] getData() {
		Object[][] testData = new Object[][] { { Platform.WIN10, "chrome", "67.0" },
				{ Platform.WIN8, "firefox", "57.0" } };
		return testData;
	}

	@Test
	public void browserStackDemoTest() throws MalformedURLException {

		caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "76.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("name", "Bstack-[Java] Sample Test");

		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://demoqa.com/html-contact-form/");
		driver.findElement(By.className("firstname")).sendKeys("Alok");

		driver.findElement(By.id("lname")).sendKeys("Shrivastava");

		driver.findElement(By.xpath("//input[@value='Submit']")).submit();

		System.out.println(driver.getTitle());
	}

}