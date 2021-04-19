package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_Page {

	@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[5]")
	private WebElement backtoaccount;
	public WebDriver driver;

	public Back_Page(WebDriver driverI) {
		this.driver = driverI;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBacktoaccount() {
		return backtoaccount;
	}

}
