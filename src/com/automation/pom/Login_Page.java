package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
   
	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='passwd']")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement submit_btn;

	public WebDriver driver;

	public Login_Page(WebDriver driverB) {
		this.driver = driverB;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}


}
