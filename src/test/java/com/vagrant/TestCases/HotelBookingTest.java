package com.vagrant.TestCases;
import com.sun.javafx.PlatformUtil;
import com.vagrant.BaseClass.BaseClass;
import com.vagrant.Pages.Vagrant_FlightBooking;
import com.vagrant.Pages.Vagrant_HotelBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HotelBookingTest extends BaseClass {

	private Vagrant_HotelBooking vagrantHotelBookingPage;
	
	@BeforeClass
	public void init() {
		vagrantHotelBookingPage = new Vagrant_HotelBooking();
	}
	
    WebDriver driver = new ChromeDriver();

    @FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;

    @Test
    public void shouldBeAbleToSearchForHotels() {
   
        driver.get("https://www.cleartrip.com/");
        hotelLink.click();

        localityTextBox.sendKeys("Indiranagar, Bangalore");

        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();

        driver.quit();

    }

}
