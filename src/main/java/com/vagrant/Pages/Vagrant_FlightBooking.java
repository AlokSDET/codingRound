package com.vagrant.Pages;

import static com.vagrant.Util.Vagrant_Utility.clickElement;
import static com.vagrant.Util.Vagrant_Utility.implicitwait;
import static com.vagrant.Util.Vagrant_Utility.sendKeys;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vagrant.BaseClass.BaseClass;

public class Vagrant_FlightBooking extends BaseClass {

	@FindBy(id = "OneWay")
	private WebElement oneWay;

	@FindBy(id = "RoundTrip")
	private WebElement roundTrip;

	@FindBy(xpath = "//input[@id='FromTag']")
	private WebElement fromTag;

	@FindBy(id = "ToTag")
	private WebElement toTag;

	@FindBy(id = "SearchBtn")
	private WebElement searchBtn;

	@FindBy(xpath = "//ul[@id='ui-id-1']//li")
	private List<WebElement> originOptions;

	@FindBy(xpath = "//ul[@id='ui-id-2']//li")
	private List<WebElement> destinationOptions;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']//div[1]//div//div[1]//span[@class='ui-datepicker-year']")
	private WebElement yearFromFrstPanelOfDatePicker;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']//div[1]//div//div[1]//span[@class='ui-datepicker-month']")
	private WebElement monthFromFrstPanelOfDatePicker;
		
	@FindBy(xpath = "//*[@id='ui-datepicker-div']//div[2]//div//div[1]//span[@class='ui-datepicker-month']")
	private WebElement monthFromScndPanelOfDatePicker;
	
	@FindBy(xpath = "//div/a[@class='nextMonth ']")
	private WebElement nextMonthBtn;
	
	public Vagrant_FlightBooking() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrentYear() {
		return yearFromFrstPanelOfDatePicker.getText();
	}
	
	public String getMonthFromFirstPanel_DatePicker() {
		return monthFromFrstPanelOfDatePicker.getText();
	}
	
	public String getMonthFromSecondPanel_DatePicker() {
		return monthFromScndPanelOfDatePicker.getText();
	}
	
	public WebElement getNextMonthElement() {
		return nextMonthBtn;
	}
	
	public Vagrant_FlighResults clickSearchButton() {
		clickElement(searchBtn);
		return new Vagrant_FlighResults();
	}

	public void selectTripType(String tripType) {
		if (tripType.equals("OneWay")) {
			clickElement(oneWay);

		} else if (tripType.equals("RoundTrip")) {
			clickElement(roundTrip);
		}
	}

	public boolean enterSourceCity(String sourceCity) {
		boolean flag = false;
		clickElement(fromTag);
		fromTag.clear();
		sendKeys(fromTag, sourceCity);
		// wait for the auto complete options to appear for the source
		implicitwait(Config.getProperty("ImplicitWait"));
		
		for (WebElement e : originOptions) {
			if (e.getText().toUpperCase().contains(sourceCity.toUpperCase())) {
				clickElement(e);
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean enterDestinationCity(String destinationCity) {
		boolean flag = false;
		clickElement(toTag);
		toTag.clear();
		sendKeys(toTag, destinationCity);
		// wait for the auto complete options to appear for the destination
		implicitwait(Config.getProperty("ImplicitWait"));
		for (WebElement e : destinationOptions) {
			if (e.getText().toUpperCase().contains(destinationCity.toUpperCase())) {
				clickElement(e);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
