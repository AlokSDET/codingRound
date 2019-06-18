package com.vagrant.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.javafx.PlatformUtil;
import com.vagrant.BaseClass.BaseClass;

@SuppressWarnings("restriction")
public class Vagrant_Utility extends BaseClass {

	static JavascriptExecutor je = (JavascriptExecutor) driver;

	public static void setDriverPath(String browserName) {
		switch (browserName) {
		case "Chrome":
			if (PlatformUtil.isMac()) {
				System.setProperty("webdriver.chrome.driver", "chromedriver");
			}
			if (PlatformUtil.isWindows()) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			}
			if (PlatformUtil.isLinux()) {
				System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
			}
			break;

		case "Firefox":
			if (PlatformUtil.isMac()) {
				System.setProperty("webdriver.gecko.driver", "geckodriver");
			}
			if (PlatformUtil.isWindows()) {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			}
			if (PlatformUtil.isLinux()) {
				System.setProperty("webdriver.gecko.driver", "geckodriver_linux");
			}
			break;

		default:
			System.out.println("Not required to set the driver path");
		}
	}

	public static void checkPageIsReady() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (js.executeScript("return document.readyState").toString().equals("complete")) {
			System.out.println("Page Is loaded.");
			return;
		}

		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static void clickElement(WebElement e) {
		explicitwait(2000, e);
		e.click();
	}

	public static void sendKeys(WebElement e, String s) {
		explicitwait(2000, e);
		e.sendKeys(s);
	}

	public static void javaScriptClick(WebElement e) {
		explicitwait(2000, e);
		je.executeScript("arguments[0].click();", e);
	}

	public static void explicitwait(int timeout, WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public static void implicitwait(String timeout) {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeout), TimeUnit.SECONDS);
	}

	public static void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
		}
	}
}
