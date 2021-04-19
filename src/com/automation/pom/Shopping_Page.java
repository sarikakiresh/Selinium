package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Page {

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	private WebElement evening_dresses;

	@FindBy(xpath = "//a[@title='Printed Dress']")
	private WebElement printeddress;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement quickview;

	public WebDriver driver;

	public Shopping_Page(WebDriver driverc) {
		this.driver = driverc;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEvening_dresses() {
		return evening_dresses;
	}

	public WebElement getPrinteddress() {
		return printeddress;
	}

	public WebElement getQuickview() {
		return quickview;
	}

}
