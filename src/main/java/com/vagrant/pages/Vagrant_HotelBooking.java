package com.vagrant.pages;

import static com.vagrant.util.Vagrant_Utility.clickElement;
import static com.vagrant.util.Vagrant_Utility.implicitwait;
import static com.vagrant.util.Vagrant_Utility.sendKeys;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vagrant.baseClass.BaseClass;
import com.vagrant.util.Vagrant_Utility;

public class Vagrant_HotelBooking extends BaseClass {

	// Use of encapsulation by keeping all members private and keeping getter .
	@FindBy(xpath = "//a[text()='Hotels']")
	private WebElement hotelLink;

	@FindBy(css = "input[name='from']")
	private WebElement localityTextBox;

	@FindBy(xpath = "//input[@id='SearchHotelsButton']")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	@FindBy(xpath = "//ul[@id='ui-id-1']//li")
	private List<WebElement> hotelsSuggestions;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']//div[1]//div//div[1]//span[@class='ui-datepicker-year']")
	private WebElement yearFromFrstPanelOfDatePicker;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']//div[1]//div//div[1]//span[@class='ui-datepicker-month']")
	private WebElement monthFromFrstPanelOfDatePicker;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']//div[2]//div//div[1]//span[@class='ui-datepicker-month']")
	private WebElement monthFromScndPanelOfDatePicker;

	@FindBy(xpath = "//div/a[@class='nextMonth ']")
	private WebElement nextMonthBtn;

	public Vagrant_HotelBooking() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrentYear() {
		Vagrant_Utility.explicitwait(10, yearFromFrstPanelOfDatePicker);
		return yearFromFrstPanelOfDatePicker.getText();
	}

	public String getMonthFromFirstPanel_DatePicker() {
		Vagrant_Utility.explicitwait(10, monthFromFrstPanelOfDatePicker);
		return monthFromFrstPanelOfDatePicker.getText();
	}

	public String getMonthFromSecondPanel_DatePicker() {
		Vagrant_Utility.explicitwait(10, monthFromScndPanelOfDatePicker);
		return monthFromScndPanelOfDatePicker.getText();
	}

	public WebElement getNextMonthElement() {
		return nextMonthBtn;
	}

	public void openHotelsPage() {
		clickElement(hotelLink);
	}

	public boolean enterHotelPlaceOrName(String hotelPlaceOrName) {
		boolean flag = false;
		clickElement(localityTextBox);
		localityTextBox.clear();
		sendKeys(localityTextBox, hotelPlaceOrName);
		// wait for the auto complete options to appear for the source
		implicitwait(Config.getProperty("ImplicitWait"));
		for (WebElement e : hotelsSuggestions) {
			if (e.getText().toUpperCase().contains(hotelPlaceOrName.toUpperCase())) {
				clickElement(e);
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void selectTravellers(String travellersDetails) {
		Select travellerDropDown = new Select(travellerSelection);
		travellerDropDown.selectByVisibleText(travellersDetails);
	}

	public Vagrant_HotelResults clickSearchButton() {
		clickElement(searchButton);
		return new Vagrant_HotelResults();
	}
}
