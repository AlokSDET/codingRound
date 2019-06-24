package com.vagrant.testCases;

import static com.vagrant.util.Vagrant_Utility.checkPageIsReady;
import static com.vagrant.util.Vagrant_Utility.clickElement;
import static com.vagrant.util.Vagrant_Utility.isElementPresent;
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
import com.vagrant.pages.Vagrant_FlightBooking;

//use of inheritance oops concept
public class FlightBookingTest extends BaseClass implements VagrantInterface {

	private Vagrant_FlightBooking vagrantFlightBookingPage;

	@BeforeClass
	public void init() {
		vagrantFlightBookingPage = new Vagrant_FlightBooking();
		driver.get(Config.getProperty("Testing_URL") + "flights");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		// loading main page
		driver.get(Config.getProperty("Testing_URL"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void testThatResultsAppearForOneWayJourney() throws Exception {

		vagrantFlightBookingPage.selectTripType("OneWay");

		vagrantFlightBookingPage.enterSourceCity(Config.getProperty("From_City"));

		vagrantFlightBookingPage.enterDestinationCity(Config.getProperty("To_City"));

		selectDateFromDatePicker(Config.getProperty("Travel_Date"));

		// all fields filled in. Now click on search
		vagrantFlightBookingPage.clickSearchButton();

		checkPageIsReady();

		// verify that result appears for the provided journey search
		Assert.assertTrue(isElementPresent(By.className("searchSummary")));

	}

	/**
	 * use of java doc This method will select the given date from date picker.
	 * 
	 * @param travelDate: date should be in dd-month-YYYY format ex. 30-June-2019
	 * @throws Exception
	 */
	private void selectDateFromDatePicker(String travelDate) throws Exception {
		String dateToBeSelected = travelDate.split("-")[0];
		String monthToBeSelected = travelDate.split("-")[1];
		String yearToBeSelected = travelDate.split("-")[2];

		Date travelDepartDate = new SimpleDateFormat("dd-MMMM-yyyy").parse(travelDate);

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
		Date todaysDate = new Date();
		System.out.println(formatter.format(todaysDate));

		long diffInMillies = Math.abs(travelDepartDate.getTime() - todaysDate.getTime());
		long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		if (todaysDate.compareTo(travelDepartDate) > 0) {
			System.out.println("Date is disabled as travel date can not be selected before todays date.");
		} else if (diff > 365) {
			System.out.println("Date is disabled as travel date can not be selected after one year of todays date.");
		}

		else {
			// Selection of year
			String currentYear = vagrantFlightBookingPage.getCurrentYear();
			if (currentYear.equals(yearToBeSelected)) {
				System.out.println("Expected Year is already selected.");
			} else {
				for (int i = 1; i < 12; i++) {
					clickElement(vagrantFlightBookingPage.getNextMonthElement());
					waitFor(1000);
					currentYear = vagrantFlightBookingPage.getCurrentYear();
					if (currentYear.equals(yearToBeSelected)) {
						System.out.println("Expected year is get selected now.");
						break;
					}
				}
			}

			// Selection of Month
			int next = 0;
			String currentMonth = vagrantFlightBookingPage.getMonthFromFirstPanel_DatePicker();
			if (currentMonth.equals(monthToBeSelected)) {
				next = 1;
				System.out.println("Expected month is already selected");
			} else {
				for (int i = 1; i < 12; i++) {
					if (vagrantFlightBookingPage.getNextMonthElement().isDisplayed()) {
						clickElement(vagrantFlightBookingPage.getNextMonthElement());
						waitFor(1000);
						currentMonth = vagrantFlightBookingPage.getMonthFromFirstPanel_DatePicker();
						if (currentMonth.equals(monthToBeSelected)) {
							next = 1;
							System.out.println("Expected month is get selected now.");
							break;
						}
					} else {
						currentMonth = vagrantFlightBookingPage.getMonthFromSecondPanel_DatePicker();
						if (currentMonth.equals(monthToBeSelected)) {
							next = 2;
							System.out.println("Expected month is get selected now.");
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
}
