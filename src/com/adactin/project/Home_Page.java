package com.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement dateinset;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateoutset;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultsperroom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childrenperroom;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public Home_Page(WebDriver driverB) {
		this.driver = driverB;
		PageFactory.initElements(driverB, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDateinset() {
		return dateinset;
	}

	public WebElement getDateoutset() {
		return dateoutset;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
