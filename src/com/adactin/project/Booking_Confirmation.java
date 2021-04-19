package com.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement myitinerary;
	public WebDriver driver;

	public Booking_Confirmation(WebDriver driverE) {
		this.driver = driverE;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

}
