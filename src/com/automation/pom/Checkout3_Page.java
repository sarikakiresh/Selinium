package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout3_Page {

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceedtocheckout3;
	
	public WebDriver driver;

	public Checkout3_Page(WebDriver driverF) {
		this.driver = driverF;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtocheckout3() {
		return proceedtocheckout3;
	}

}
