package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");// url
		driver.manage().window().maximize();// maximize
		WebElement emailing = driver.findElement(By.xpath("//input[@type='text']"));
		// is enabled
		boolean enabled = emailing.isEnabled();
		System.out.println("enabled or not:" + enabled);
		// is displayed
		boolean displayed = emailing.isDisplayed();
		System.out.println("displayed or not:" + displayed);
		// send keys
		emailing.sendKeys("sarika123@gmail.com");// wanted input data in login
		// get Attribute
		String input_Givendata = emailing.getAttribute("text");
		System.out.println("passed Data:" + input_Givendata);
		// get Attribute
		String attribute_value = emailing.getAttribute("type");
		System.out.println("attribute value:" + attribute_value);
		// clear
		emailing.clear();
		// send keys
		emailing.sendKeys("sarika@gmail.com");
		// get text
		WebElement create_txt = driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
		String value = create_txt.getText();
		System.out.println("text:" + value);
		WebElement createnewaccount_btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnewaccount_btn.click();
		Thread.sleep(2000);
		WebElement gender_btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender_btn.click();
		//is selected
				boolean selected = gender_btn.isSelected();
				System.out.println("selected or not:"+selected);
				
		driver.close();

	}

}
