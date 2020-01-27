package com.vagrant.testCases;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;
import com.vagrant.baseClass.VagrantInterface;
import com.vagrant.pages.Vagrant_FlightBooking;

public class CssExample extends BaseClass implements VagrantInterface {

	@BeforeClass
	public void init() {

		//driver.get(config.getProperty("Testing_URL") + "flights");
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test(description = "finding xpath by css")
	public void findXpathByCssAndPerformAction() {

	       //Get IDs of all WebElements
	       List<WebElement> allids =driver.findElements(By.xpath(".//*"));        
	       
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Shrivastava");
	}
	

	@Test(description = "finding xpath by css")
	public void findAllElementsById() {
	       //Get IDs of all WebElements
	       List<WebElement> allids =driver.findElements(By.xpath(".//*"));              
	       for(WebElement e : allids) {
	    	   System.out.println(e.getAttribute("id"));
	       }
	}
	
	@Test()
	public void pattern1() {
		int n =3;
		for(int i=1; i<=n ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	
	@Test() 
	public void windoHandles() {
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).click();
		// Returns unique handle for each window in the current driver instance.
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle: windowHandles) {
			System.out.println(windowHandle);
		}
		
		PageFactory.initElements(driver, this);
	}
	
	 @Test(retryAnalyzer = IretryLogic.class)
	 public void Test1()
	 {
	 Assert.assertEquals(true, true);
	 }
	 
}
