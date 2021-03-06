package com.vagrant.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.javafx.PlatformUtil;
import com.vagrant.baseClass.BaseClass;

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
				Thread.sleep(5000);
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
		explicitwait(10, e);
		e.click();
	}

	public static void sendKeys(WebElement e, String s) {
		explicitwait(10, e);
		e.sendKeys(s);
	}

	public static String getText(WebElement e) {
		explicitwait(10, e);
		return e.getText();
	}

	public static void javaScriptClick(WebElement e) {
		explicitwait(10, e);
		je.executeScript("arguments[0].click();", e);
	}

	public static void explicitwait(long timeout, WebElement e) {
	//@SuppressWarnings("deprecation")
		//WebDriverWait wait = new WebDriverWait(driver, timeout);
		//wait.until(ExpectedConditions.visibilityOf(e));
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

	// use of method overloading
	public static void switchToFrame(WebElement iFrameElement) {
		explicitwait(10, iFrameElement);
		driver.switchTo().frame(iFrameElement);
	}

	public static void switchToFrame(int iFrameIndex) {
		driver.switchTo().frame(iFrameIndex);
	}

	public static void switchToFrame(String iFrameName) {
		driver.switchTo().frame(iFrameName);
	}

	public static void switchToMainIframe() {
		driver.switchTo().defaultContent();
	}

}
