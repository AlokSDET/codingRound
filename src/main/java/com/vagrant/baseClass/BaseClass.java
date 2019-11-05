package com.vagrant.baseClass;

import static com.vagrant.util.Constant.PROPERTY_FILE_PATH;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vagrant.util.Vagrant_Utility;

public class BaseClass {

	public static Properties config = null;

	public static ExtentReports report;

	public static ExtentTest test;

	public static String browserName;

	public static WebDriver driver;

	public static void fileSetup() {
		FileInputStream fs = null;
		// use of exception handling
		try {
			fs = new FileInputStream(new File(PROPERTY_FILE_PATH));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		config = new Properties();
		try {
			config.load(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void setUp() throws Exception {

		fileSetup();

		browserName = config.getProperty("BrowserName");

		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");

			Vagrant_Utility.setDriverPath(browserName);

			driver = new ChromeDriver(options);
			Reporter.log(browserName + " Opened");
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			Vagrant_Utility.setDriverPath(browserName);

			driver = new FirefoxDriver();
			Reporter.log(browserName + " Opened");
			// log.info(BrowserName+" Opened");
			driver.manage().window().maximize();
			Reporter.log(browserName + " Maximized");
		} else if (browserName.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();
			Reporter.log(browserName + " Opened");

		} else {
			Reporter.log(browserName + " is invalid");

			throw new Exception("Invalid Browser Name");
		}

		driver.get(config.getProperty("Testing_URL"));
		driver.manage().window().maximize();
		Reporter.log(config.getProperty("Testing_URL") + " Opened");

		// Applying implicit wait
		Vagrant_Utility.implicitwait(config.getProperty("ImplicitWait"));

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("after test entered");
		if (driver != null) {
			System.out.println("after test should run");
			driver.quit();
		}

	}

}
