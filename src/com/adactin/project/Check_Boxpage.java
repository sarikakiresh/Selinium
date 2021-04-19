package com.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Boxpage {
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement check_box;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	public WebDriver driver;

	public Check_Boxpage(WebDriver driverC) {
		this.driver = driverC;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheck_box() {
		return check_box;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
