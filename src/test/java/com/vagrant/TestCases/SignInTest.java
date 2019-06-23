package com.vagrant.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vagrant.BaseClass.BaseClass;
import com.vagrant.Pages.Vagrant_SignIn;
import com.vagrant.Util.Vagrant_Utility;

public class SignInTest extends BaseClass {

	private Vagrant_SignIn vagrant_SignIn;

	@BeforeClass
	public void init() {
		vagrant_SignIn = new Vagrant_SignIn();
		// loading main page
		driver.get(Config.getProperty("Testing_URL"));
	}

	@AfterClass
	public void tearDown() {
		// loading main page
		driver.get(Config.getProperty("Testing_URL"));
	}

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		vagrant_SignIn.getYourTrips();

		vagrant_SignIn.clickOnSignInLink();

		// Switch to signIn Frame
		vagrant_SignIn.switchToSignInFrame();

		vagrant_SignIn.clickOnSignInButton();

		Assert.assertTrue(vagrant_SignIn.getSignInError().contains("There were errors in your submission"));

		// Switch to main frame
		Vagrant_Utility.switchToMainIframe();

	}
}
