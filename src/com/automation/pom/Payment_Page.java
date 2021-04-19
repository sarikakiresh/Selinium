package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backtoorders;

	public WebDriver driver;

	public Payment_Page(WebDriver driverH) {
		this.driver = driverH;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getBacktoorders() {
		return backtoorders;
	}

}
