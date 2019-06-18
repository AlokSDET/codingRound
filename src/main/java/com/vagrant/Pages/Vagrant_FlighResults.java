package com.vagrant.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vagrant.BaseClass.BaseClass;

public class Vagrant_FlighResults extends BaseClass{

	 
    @FindBy(className = "searchSummary")
    private WebElement searchSummary;
    
	public Vagrant_FlighResults() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchSummaryElement() {	
		return searchSummary;
	}
}
