package com.vagrant.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;
import com.vagrant.baseClass.VagrantInterface;
import com.vagrant.pages.Vagrant_FlightBooking;

public class CssExample extends BaseClass implements VagrantInterface {

	@BeforeClass
	public void init() {

		driver.get(config.getProperty("Testing_URL") + "flights");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test(description = "finding xpath by css")
	public void findXpathByCssAndPerformAction() {

		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Shrivastava");
	}
}
