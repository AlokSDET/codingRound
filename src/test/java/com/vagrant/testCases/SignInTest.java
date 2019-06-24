package com.vagrant.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;
import com.vagrant.baseClass.VagrantInterface;
import com.vagrant.pages.Vagrant_SignIn;
import com.vagrant.util.Vagrant_Utility;

public class SignInTest extends BaseClass implements VagrantInterface {

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
