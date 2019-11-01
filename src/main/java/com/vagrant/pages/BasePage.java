package com.vagrant.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vagrant.baseClass.BaseClass;

public class BasePage {

	public static  WebDriver driver = BaseClass.driver;
	
	public static Properties config = BaseClass.config;
	
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
