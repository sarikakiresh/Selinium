package com.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotelpage {
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement Firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement Lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cc;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement ccmonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement ccyear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	public WebDriver driver;

	public Book_Hotelpage(WebDriver driverD) {
		this.driver = driverD;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}
	
	public WebElement getAddress() {
		return address;
	}


	public WebElement getCc() {
		return cc;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
