package com.seleniumgrid.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTests {

	@Test()
	public void test1() throws MalformedURLException {

		// need to do setup for selenium grid , download selenium standalone server ,
		// and use commands to make hub and node.

		ChromeOptions options = new ChromeOptions();

		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);

		URL url = new URL("http://localhost:4444/wd/hub");

		WebDriver driver = new RemoteWebDriver(url, options);

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.quit();
	}
}
