package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox_Page {

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement processCarrier;
	
	public WebDriver driver;

	public Checkbox_Page(WebDriver driverG) {
		this.driver = driverG;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProcessCarrier() {
		return processCarrier;
	}
}
