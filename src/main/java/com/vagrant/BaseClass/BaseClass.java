package com.vagrant.BaseClass;

import static com.vagrant.Util.Constant.PROPERTY_FILE_PATH;

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

import com.vagrant.Util.Vagrant_Utility;

public class BaseClass {

	public static Properties Config = null;

	public static String browserName;

	public static WebDriver driver;

	public static void fileSetup() {
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(new File(PROPERTY_FILE_PATH));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Config = new Properties();
		try {
			Config.load(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void setUp() throws Exception {

		fileSetup();

		browserName = Config.getProperty("BrowserName");

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

		driver.get(Config.getProperty("Testing_URL"));
		driver.manage().window().maximize();
		Reporter.log(Config.getProperty("Testing_URL") + " Opened");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("ImplicitWait")),
				TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
