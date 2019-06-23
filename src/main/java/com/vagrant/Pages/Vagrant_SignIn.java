package com.vagrant.Pages;

import static com.vagrant.Util.Vagrant_Utility.clickElement;
import static com.vagrant.Util.Vagrant_Utility.explicitwait;
import static com.vagrant.Util.Vagrant_Utility.getText;
import static com.vagrant.Util.Vagrant_Utility.switchToFrame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vagrant.BaseClass.BaseClass;

// use of page factory design pattern.

public class Vagrant_SignIn extends BaseClass {

	public Vagrant_SignIn() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Your trips")
	private WebElement yourTrips;

	@FindBy(id = "SignIn")
	private WebElement signInLink;

	@FindBy(xpath = "//button[@id='signInButton']")
	private WebElement signInButton;

	@FindBy(xpath = "//div[@id='errors1']")
	private WebElement signInError;

	@FindBy(xpath = "//iframe[@id='modal_window']")
	private WebElement signInFrame;

	public void getYourTrips() {
		clickElement(yourTrips);
	}

	public void clickOnSignInLink() {
		clickElement(signInLink);
	}

	public void clickOnSignInButton() {
		explicitwait(10, signInButton);
		clickElement(signInButton);
	}

	public String getSignInError() {
		return getText(signInError);
	}

	public void switchToSignInFrame() {
		switchToFrame(signInFrame);
	}
}
