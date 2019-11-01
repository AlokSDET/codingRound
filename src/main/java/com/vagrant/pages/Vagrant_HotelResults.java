package com.vagrant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vagrant.baseClass.BaseClass;

public class Vagrant_HotelResults extends BasePage {

	@FindBy(className = "searchSummary")
	private WebElement searchSummary;

	public Vagrant_HotelResults() {
		super(driver);
	}

	public WebElement getSearchSummaryElement() {
		return searchSummary;
	}

}
