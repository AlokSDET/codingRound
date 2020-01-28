package com.vagrant.testCases;

import java.lang.reflect.Method;

import javax.management.DescriptorKey;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.vagrant.baseClass.BaseClass;
import com.vagrant.baseClass.VagrantInterface;
import com.vagrant.pages.Vagrant_SignIn;
import com.vagrant.util.Vagrant_Utility;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class SignInTest extends BaseClass implements VagrantInterface {

	private Vagrant_SignIn vagrant_SignIn;

	@BeforeClass
	public void init() {
		System.out.println(System.getProperty("user.dir"));
		report = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\ExtentReportResults.html");
		vagrant_SignIn = new Vagrant_SignIn();
		// loading main page
		driver.get(config.getProperty("Testing_URL"));
	}

	@AfterClass
	public void tearDown() {
		// loading main page
		driver.get(config.getProperty("Testing_URL"));
		report.endTest(test);
		report.flush();
	}

	@BeforeMethod
	public void BeforeMethod(Method m) {

		System.out.println(m.getName() + "method execution started");
		test = report.startTest(m.getName());

	}

	@Test(priority = 1, description = "Erros display for incorrect credentials")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case for checking that it displays error for incorret credentials.")
	@Story("Story name to check login functionality for negative test case")
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		System.out.println(test.getStartedTime());

		vagrant_SignIn.getYourTrips();

		vagrant_SignIn.clickOnSignInLink();

		// Switch to signIn Frame
		vagrant_SignIn.switchToSignInFrame();

		vagrant_SignIn.clickOnSignInButton();

		if (vagrant_SignIn.getSignInError().contains("There were errors in your submission")) {
			test.log(LogStatus.PASS, "Test is successfully executed");
		} else {
			test.log(LogStatus.FAIL, "Test is successfully not executed");
			// to add screenshot in failed steps.
			// test.log(LogStatus.FAIL, test.addScreenCapture(imagePath));
		}

		Assert.assertTrue(vagrant_SignIn.getSignInError().contains("There were errors in your submission"));

		// Switch to main frame
		Vagrant_Utility.switchToMainIframe();

	}
}
