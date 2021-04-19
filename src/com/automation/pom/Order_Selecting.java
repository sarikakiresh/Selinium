package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.concepts.Webelements_demo;

public class Order_Selecting {

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement iframe_button;

	@FindBy(xpath = "(//a[@data-field-qty='qty'])[2]")
	private WebElement quantity;

	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement select_size;

	@FindBy(xpath = "//a[@name='Pink']")
	private WebElement color_select;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addtocart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;

	public WebDriver driver;

	public Order_Selecting(WebDriver driverD) {
		this.driver = driverD;
		PageFactory.initElements(driver, this);
	}

	public WebElement getIframe_button() {
		return iframe_button;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSelect_size() {
		return select_size;
	}

	public WebElement getColor_select() {
		return color_select;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

}
