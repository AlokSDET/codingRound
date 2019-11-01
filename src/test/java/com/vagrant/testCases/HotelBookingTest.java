package com.vagrant.testCases;

import static com.vagrant.util.Vagrant_Utility.checkPageIsReady;
import static com.vagrant.util.Vagrant_Utility.clickElement;
import static com.vagrant.util.Vagrant_Utility.waitFor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;
import com.vagrant.baseClass.VagrantInterface;
import com.vagrant.pages.Vagrant_HotelBooking;

public class HotelBookingTest extends BaseClass implements VagrantInterface {

	private Vagrant_HotelBooking vagrantHotelBookingPage;

	@BeforeClass
	public void init() {
		vagrantHotelBookingPage = new Vagrant_HotelBooking();
		driver.get(config.getProperty("Testing_URL") + "hotels");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		// loading main page
		driver.get(config.getProperty("Testing_URL"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void shouldBeAbleToSearchForHotels() throws Exception {
		vagrantHotelBookingPage.openHotelsPage();

		vagrantHotelBookingPage.enterHotelPlaceOrName("Indiranagar, Bangalore");

		selectCheckIn_CheckOutDate(config.getProperty("CheckIn_Date"), config.getProperty("CheckOut_Date"));

		vagrantHotelBookingPage.selectTravellers("1 room, 2 adults");

		vagrantHotelBookingPage.clickSearchButton();

		// wait until page is loaded fully.
		checkPageIsReady();

		// assert that hotels list is displaying in result.
		Assert.assertTrue(driver.findElements(By.xpath("//ul[@class='listView clearFix']//li")).size() > 0,
				"Hotels lists are not displaying for given criterian.");
	}

	private void selectCheckIn_CheckOutDate(String checkInDate, String checkOutDate) throws Exception {
		Date travelCheckInDate = new SimpleDateFormat("dd-MMMM-yyyy").parse(checkInDate);
		Date travelCheckOutDate = new SimpleDateFormat("dd-MMMM-yyyy").parse(checkOutDate);

		if (travelCheckInDate.compareTo(travelCheckOutDate) >= 0) {
			System.out.println("Check out date should be after check in date.");
		} else {

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
			Date todaysDate = new Date();
			System.out.println(formatter.format(todaysDate));

			long diffInMillies = Math.abs(travelCheckInDate.getTime() - todaysDate.getTime());
			long diffInCheckInDateFromToday = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

			diffInMillies = Math.abs(travelCheckOutDate.getTime() - todaysDate.getTime());
			long diffInCheckOutDateFromToday = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

			if (todaysDate.compareTo(travelCheckInDate) > 0 || todaysDate.compareTo(travelCheckOutDate) > 0) {
				System.out.println(
						"Date is disabled as check in and check out  date can not be selected before todays date.");
			} else if (diffInCheckInDateFromToday > 365 || diffInCheckOutDateFromToday > 365) {
				System.out.println(
						"Date is disabled as check in  and check out date can not be selected after one year of todays date.");
			} else {
				// Selection of check in date
				selectHotelTravelDate(checkInDate);
				// Selection of check out date
				System.out.println(checkOutDate);
				selectHotelTravelDate(checkOutDate);
			}
		}

	}

	private void selectHotelTravelDate(String travelDate) {
		// Selection of check in date
		waitFor(2000);
		String dateToBeSelected = travelDate.split("-")[0];
		String monthToBeSelected = travelDate.split("-")[1];
		String yearToBeSelected = travelDate.split("-")[2];

		// Selection of year
		String currentYear = vagrantHotelBookingPage.getCurrentYear();
		if (currentYear.equals(yearToBeSelected)) {
			System.out.println("Expected travel Year is already selected.");
		} else {
			for (int i = 1; i < 12; i++) {
				clickElement(vagrantHotelBookingPage.getNextMonthElement());
				waitFor(1000);
				currentYear = vagrantHotelBookingPage.getCurrentYear();
				if (currentYear.equals(yearToBeSelected)) {
					System.out.println("Expected travel year is get selected now.");
					break;
				}
			}
		}

		// Selection of Month
		int next = 0;

		String currentMonth = vagrantHotelBookingPage.getMonthFromFirstPanel_DatePicker();
		if (currentMonth.equals(monthToBeSelected)) {
			next = 1;
			System.out.println("Expected travel month is already selected");
		} else {
			for (int i = 1; i < 12; i++) {
				if (vagrantHotelBookingPage.getNextMonthElement().isDisplayed()) {
					clickElement(vagrantHotelBookingPage.getNextMonthElement());
					waitFor(1000);
					currentMonth = vagrantHotelBookingPage.getMonthFromFirstPanel_DatePicker();
					if (currentMonth.equals(monthToBeSelected)) {
						next = 1;
						System.out.println("Expected travel month is get selected now.");
						break;
					}
				} else {
					currentMonth = vagrantHotelBookingPage.getMonthFromSecondPanel_DatePicker();
					if (currentMonth.equals(monthToBeSelected)) {
						next = 2;
						System.out.println("Expected travel month is get selected now.");
						break;
					}
				}

			}
		}
		// Selection of Date
		if (next == 1) {
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//div[1]//a[text()=" + dateToBeSelected + "]"))
					.click();
		} else if (next == 2) {
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//div[2]//a[text()=" + dateToBeSelected + "]"))
					.click();
		}
	}

}
