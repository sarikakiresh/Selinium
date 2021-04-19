package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout2_Page {
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedtocheckout2;

	public WebDriver driver;

	public Checkout2_Page(WebDriver driverE) {
		this.driver = driverE;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceedtocheckout2() {
		return proceedtocheckout2;
	}



	
}
