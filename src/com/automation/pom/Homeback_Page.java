package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeback_Page {
	@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[7]")
	private WebElement homepage;
	public WebDriver driver;

	public Homeback_Page(WebDriver driverJ) {
		this.driver = driverJ;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomepage() {
		return homepage;
	}

}
